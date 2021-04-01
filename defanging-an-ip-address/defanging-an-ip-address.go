func defangIPaddr(address string) string {
    ans := ""
    for i:=0;i<len(address);i++{
        if(address[i]=='.'){
            ans+="[.]"
        }else{
            ans+=string(address[i])
        }
    }
    return ans
}