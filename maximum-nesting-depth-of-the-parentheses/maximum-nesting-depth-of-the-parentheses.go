func maxDepth(s string) int {
    ct:=0
    max:=0
    for i:=0;i<len(s);i++{
        if string(s[i])=="(" {
            ct++
        }else if string(s[i])==")"{
            ct--
        }
        if ct>max{
            max=ct
        }
    }
    return max
}