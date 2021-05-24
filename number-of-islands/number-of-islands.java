class Solution {
    public int numIslands(char[][] grid) {
        int ct =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    ct++;
                    bfs(grid,i,j);
                }

            }
        }
        return ct;
        
    }
    
    public void bfs(char[][] grid,int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') return;
        
        grid[i][j]='0';
        bfs(grid,i+1,j);
        bfs(grid,i,j+1);
        bfs(grid,i-1,j);
        bfs(grid,i,j-1);
    }
}