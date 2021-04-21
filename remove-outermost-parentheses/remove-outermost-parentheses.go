func removeOuterParentheses(S string) string {
    
    st:=0
    top:=0
    res:=""
    for i:=0;i<len(S);i++{
        if S[i]=='('{
            if st==0{
                top=i
            }
          st++  
        } else if S[i]==')'{
            st--
        }
        if st==0 {
            res+=S[top+1:i]  
        }
    }
    
    return res
}