class Solution {
    static int max;
    public int maxAreaOfIsland(int[][] grid) {
        max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                max = Math.max(max,dfs(i,j,grid,0));
            }
        }
        
        
        return max;
    }
    
    
    
    public int  dfs(int i, int j, int grid[][], int ct){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        return (1+ dfs(i+1,j,grid,ct) + dfs(i-1,j,grid,ct) + dfs(i,j+1,grid,ct) + dfs(i,j-1,grid,ct)); 
    }
}