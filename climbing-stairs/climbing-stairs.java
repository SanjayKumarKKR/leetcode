class Solution {
    int dp[];
    public int climbStairs(int n) {
        dp =new int[n+1];
        recursive(n);
        return dp[n];
    }
    
    
    public int recursive(int n){
        if(n==1 || n==2){
            return dp[n] = n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        
        return dp[n] = recursive(n-1) + recursive(n-2);
        
    }
}