class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            max= Math.max((Math.min(height[l],height[r]) * (r-l)),max);
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }
        }
        return max;
    }
}