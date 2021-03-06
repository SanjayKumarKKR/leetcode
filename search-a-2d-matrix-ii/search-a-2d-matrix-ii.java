class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0 , col = matrix[0].length-1;
        while(row>=0 && row<=matrix.length-1 && col>=0 && col<=matrix[0].length-1){
            // System.out.println(matrix[row][col]);
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        
        return false;
    }
}