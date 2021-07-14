class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup =new ArrayList<>();
        int f=0;
        for(int i=0;i<nums.length;i++){
            f= nums[i]>nums.length ? nums[i]-nums.length : nums[i]<0 ? -nums[i] : nums[i];
            f--;
            if(nums[f]<0){
                nums[f]=-nums[f]+nums.length; 
                dup.add(f+1);
            }else{
                nums[f] = -nums[f];
            }
            // for(int a : nums){
            //     System.out.print(a+" ");
            // }
            // System.out.println();
        }
       
        return dup;
    }
}