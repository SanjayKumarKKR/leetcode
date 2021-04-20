func minOperations(nums []int) int {
    if len(nums)==1{
        return 0
    }
    ans:=0
    for i:=0;i<len(nums)-1;i++{
        if nums[i+1]<=nums[i]{
         
         ans += nums[i]-nums[i+1]+1
        nums[i+1]=nums[i]+1
        }
    }
    return ans
    
}