func decode(encoded []int, first int) []int {
    
    var ans []int
    ans =append(ans,first)
    for i:=0;i<len(encoded);i++{
        ans = append(ans,encoded[i]^ans[i])
    }
    return ans
}