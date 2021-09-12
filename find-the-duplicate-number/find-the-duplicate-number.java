class Solution {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];
        do{
            System.out.println(slow +" " + fast);
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast!=slow);
            
        fast =nums[0];
        while(slow!=fast){
            fast= nums[fast];
            slow = nums[slow];
        }
        return fast;
    }
}