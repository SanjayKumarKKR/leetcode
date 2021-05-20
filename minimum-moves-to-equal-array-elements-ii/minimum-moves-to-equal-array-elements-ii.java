class Solution {
    public int minMoves2(int[] nums) {
          Arrays.sort(nums);
        int ans=0;
        int st=0,end=nums.length-1;
        while(st<end){
            ans+=nums[end]-nums[st];
            st++;
            end--;
        }
        return ans;
    }
}