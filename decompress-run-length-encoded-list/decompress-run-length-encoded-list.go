func decompressRLElist(nums []int) []int {
    freq:=0
    val:=0
    var ans []int
    for i:=0;i<len(nums);i++{
        freq = nums [i]
        i++;
        val = nums [i]
        for j:=0;j<freq;j++{
            ans = append(ans, val)
        }
        
    }
    return ans
}