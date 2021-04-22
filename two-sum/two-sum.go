func twoSum(nums []int, target int) []int {
    ans:= make([]int,2,2)
    for i:=0;i<len(nums);i++{
        for j:=i+1;j<len(nums);j++{
            if nums[i]+nums[j]==target{
                ans[0]=i
                ans[1]=j
                return ans
            }
        }
    }
    return ans
}