class Solution {
    public int findMin(int[] nums) {
        int st = 0, end = nums.length-1;
        int first =0, last =nums.length-1;
        int min =Integer.MAX_VALUE;
        if(nums[first]<=nums[last]){
            return nums[first];
        }
        while(st<=end){
            int mid =st +((end-st)/2);
            // System.out.println(nums[mid]+" "+st +" "+end);
            if(nums[mid]>=nums[first] && nums[mid]>=nums[last]){
                st =mid+1;
            }else{
                end= mid-1;
            }
        }
        
        return nums[st];
    }
}