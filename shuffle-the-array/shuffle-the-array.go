func shuffle(nums []int, n int) []int {
    ans := make([]int, 2*n)
    index := n
    pos :=0
    for i:=0;i<n;i++{
        ans[pos] = nums[i]
        pos++
        ans[pos]=nums[index]
        index++
        pos++
    }
    return ans
}