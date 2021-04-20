func halvesAreAlike(s string) bool {
    l:=0
    r:=0
    for i:=0;i<len(s);i++{
        if i<(len(s)/2){
            if s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U' {
                 l++
            } 
        }  else if i>=(len(s)/2){
            if s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U' {
                 r++
            } 
        }
    }
    fmt.Println(l,r)
    return (r==l)
}