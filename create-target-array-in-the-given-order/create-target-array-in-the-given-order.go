func createTargetArray(nums []int, index []int) []int {
    ans:= make([]int,len(nums))
    for i:=0;i<len(nums);i++{
        if index[i]<i{
            for j:=len(nums)-1;j>=index[i]+1;j--{
                ans[j]=ans[j-1]
            }
        }
        ans[index[i]]=nums[i]
    }
    return ans
}