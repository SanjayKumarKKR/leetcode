func smallerNumbersThanCurrent(nums []int) []int {
    a := make([]int, len(nums))
    for k:=0;k<len(a);k++{
        a[k]=nums[k]
    }
    ans := make([]int, len(a))
    sort.Ints(a)
    for i:=0;i<len(nums);i++{
        for j:=0;j<len(a);j++{
            if nums[i]==a[j]{
                ans[i]=j;
                // fmt.Println(a[j],nums[i],i,j,a,nums)
                break;
            }
        }
    }
    return ans
}