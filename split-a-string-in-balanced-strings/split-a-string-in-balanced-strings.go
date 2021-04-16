func balancedStringSplit(s string) int {
    ct:=0
    ans:=0
    for i:=0;i<len(s);i++{
        if string(s[i])=="L"{
            ct++
        }else{
           ct-- 
        }
        if ct==0{
            ans++;
        }
    }
    return ans
}