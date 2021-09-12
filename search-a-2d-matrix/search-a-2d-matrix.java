class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int st_row = -1;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target){
                st_row = i;
            }
        }
        if(st_row==-1){
            return false;
        }
        
        int st =0,end=matrix[st_row].length-1;
        while(st<=end){
            int mid = st+((end-st)/2);
            if(matrix[st_row][mid]==target){
                return true;
            }else if(matrix[st_row][mid]<target){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        
        return false;
    }
}