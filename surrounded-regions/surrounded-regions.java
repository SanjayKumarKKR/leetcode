class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='O'){
                solverecursive(0,i,board);
            }
            if(board[board.length-1][i]=='O'){
                solverecursive(board.length-1,i,board);
            }
        }
        
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O'){
                solverecursive(i,0,board);
            }
            if(board[i][board[0].length-1]=='O'){
                solverecursive(i,board[0].length-1,board);
            }
        }

        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='Z'){
                    board[i][j]='O';
                }
            }
        }
    }
    
    
    
    public void solverecursive(int i, int j,char board[][]) {
        if(i<0 || i>=board.length || j>=board[i].length  || j<0 || board[i][j]=='X' || board[i][j]=='Z'){
            return ;
        }
        if(board[i][j]=='O'){
            board[i][j]='Z';
        }
        solverecursive(i+1,j,board);
        solverecursive(i-1,j,board);
        solverecursive(i,j+1,board);
        solverecursive(i,j-1,board);
    }
}