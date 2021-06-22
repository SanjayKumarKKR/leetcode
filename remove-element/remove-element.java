class Solution {
    public int removeElement(int[] nums, int val) {
        // HashSet<Integer> set =new HashSet<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
                // System.out.println(set +" "+k);
            }
        }
        
        return k;
    }
}