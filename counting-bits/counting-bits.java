class Solution {
    public int[] countBits(int n) {
        int ans[] =new int [n+1];
        ans[0]=0;
        for(int i=1;i<ans.length;i++){
            if(i%2==0){
                int t=i/2;
                ans[i]=ans[t];
            }else{
                int t = i/2;
                ans[i]=ans[t]+1;
            }
        }
        
        return ans;
    }
}