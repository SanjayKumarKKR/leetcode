class Solution {
    public int candy(int[] ratings) {
        int max=0;
        int left[] =new int[ratings.length];
        int right[] =new int[ratings.length];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        
        for(int i=1;i<left.length;i++){
            if(ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }
        }
        
        for(int i=left.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                right[i]=right[i+1]+1;
            }
        }
        for(int i=0;i<left.length;i++){
            max=max+Math.max(left[i],right[i]);
        }
        
        return max;
        
    }
} 