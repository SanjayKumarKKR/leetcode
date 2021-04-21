func findNumbers(nums []int) int {
    ans:=0
    for i:=0;i<len(nums);i++{
        if len(fmt.Sprintf("%d",nums[i])) %2==0{
            ans++
        }
    }
    return ans
}