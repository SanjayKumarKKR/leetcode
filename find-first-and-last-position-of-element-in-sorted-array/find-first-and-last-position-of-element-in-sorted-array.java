class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st = 0, end = nums.length-1;
        int st_pos=-1,end_pos=-1;
        while(st<=end){
            int mid = st+((end-st)/2);
            if(nums[mid]==target){
                st_pos=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                st=mid+1;
            }else{
                end= mid-1;
            }
        }
        
        st = 0;
        end = nums.length-1;
        while(st<=end){
            int mid = st+((end-st)/2);
            if(nums[mid]==target){
                end_pos=mid;
                st = mid+1;
            }else if(nums[mid]<target){
                st=mid+1;
            }else{
                end= mid-1;
            }
        }
        
        return new int[]{st_pos,end_pos};
    }
}