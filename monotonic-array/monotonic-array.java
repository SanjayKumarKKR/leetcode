class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int k=1;
        while(k<nums.length && nums[k-1]==nums[k]){
            k++;
        }
        if(k==nums.length){
            return true;
        }
       if(nums[0]<nums[nums.length-1]){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
        }else if(nums[0]==nums[k]){
           return true;
       }else{
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1]){
                    return false;
                }
            }
        }
        return true;
        
    }
}