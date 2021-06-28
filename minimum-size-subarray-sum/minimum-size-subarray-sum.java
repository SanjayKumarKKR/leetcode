class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,sum=0,minlength=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
            // System.out.println(sum+" "+i +" "+j);
            while(sum>=target){
                sum=sum-nums[i];
                minlength=Math.min(minlength,j-i+1);
                i++;   
            }
        }
        
        return minlength==Integer.MAX_VALUE?0:minlength;
    }
}