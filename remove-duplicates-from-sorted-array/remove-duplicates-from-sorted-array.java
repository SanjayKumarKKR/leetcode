class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                nums[k]=nums[i];
                k++;
                set.add(nums[i]);
                // System.out.println(set +" "+k);
            }
        }
        
        return set.size();
    }
}