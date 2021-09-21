class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int a: nums){
            if(set.contains(a)){
                return true;
            }else{
                set.add(a);
            }
        }
        return false;
    }
}