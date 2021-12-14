class Solution {
    int dp[];
    public int tribonacci(int n) {
        dp = new int[n+1];
        recursive(n);
        
        return dp[n];
    }
    
    
    public int recursive(int n){
        if(n==0){
            return dp[n] = n;
        }
        if(n==1 || n==2){
            return dp[n] = 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        
        return dp[n] = recursive(n-1) + recursive(n-2) +recursive(n-3);
        
    }
}