class Solution {
    int dp [] =new int [107];
    public int rob(int[] nums) {
        Arrays.fill(dp,-1);
        return robs(0,nums);
    }
    
    int robs(int i, int nums[]){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]= Math.max(robs(i+2,nums)+nums[i],robs(i+1,nums));
    }
}