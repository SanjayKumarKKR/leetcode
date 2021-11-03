class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans  = new  ArrayList<List<Integer>>();
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[i].length;j++){
                int visited [][] =new int [heights.length][heights[i].length];
                boolean pacific = dfsForPacific(i,j,heights,Integer.MAX_VALUE,visited);
                visited = new int [heights.length][heights[i].length];
                boolean atlantic = dfsForAtlantic(i,j,heights,Integer.MAX_VALUE,visited);
                
                if(pacific && atlantic){
                    List<Integer> list  = new  ArrayList<Integer>();
                    list.add(i);
                    list.add(j);
                    ans.add(list);
                }
            }
        }
        
        return ans;
    }
    
    
    public boolean dfsForPacific(int i, int j, int heights[][], int prev,int visited[][]){
        if(i>=heights.length || j>=heights[i].length || visited[i][j]==1){
            return false;
        }
        if(prev < heights[i][j]){
            return false;
        }
        if(i==0 || j==0){
            return true;
        }
        
        visited[i][j]=1;
        boolean ans1,ans2,ans3,ans4;
        // System.out.println(i +" " +j);
        
        ans1 = dfsForPacific(i+1,j,heights,heights[i][j],visited);
            
        ans2 = dfsForPacific(i-1,j,heights,heights[i][j],visited);
        
        ans3 =  dfsForPacific(i,j+1,heights,heights[i][j],visited);
        
        ans4 =  dfsForPacific(i,j-1,heights,heights[i][j],visited);
        
        return (ans1 || ans2 || ans3 || ans4);
    }
    
    public boolean dfsForAtlantic(int i, int j, int heights[][], int prev,int visited[][]){
        if(i<0 || j<0 || visited[i][j]==1){
            return false;
        }
        if(prev < heights[i][j]){
            return false;
        }
        if(i==heights.length-1 || j==heights[i].length-1){
            return true;
        }
        
        visited[i][j]=1;
        boolean ans1,ans2,ans3,ans4;
        // System.out.println(i +" " +j);
        
        ans1 = dfsForAtlantic(i+1,j,heights,heights[i][j],visited);
            
        ans2 = dfsForAtlantic(i-1,j,heights,heights[i][j],visited);
        
        ans3 =  dfsForAtlantic(i,j+1,heights,heights[i][j],visited);
        
        ans4 =  dfsForAtlantic(i,j-1,heights,heights[i][j],visited);
        
        return (ans1 || ans2 || ans3 || ans4);
    }
}