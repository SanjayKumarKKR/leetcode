func truncateSentence(s string, k int) string {
    ans:=""
    for i:=0;i<len(s);i++{
        if s[i]==' '{
            ans+=string(s[i])
            k--
        }else{
            ans+=string(s[i])
        }
        if k==0{
            return ans[:len(ans)-1]
        }
    }
    
    return ans
}