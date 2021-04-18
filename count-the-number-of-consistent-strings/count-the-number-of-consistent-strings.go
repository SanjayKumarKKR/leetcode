func countConsistentStrings(allowed string, words []string) int {
    var allow = make(map[string]int)
    for i:=0;i<len(allowed);i++{
        allow[string(allowed[i])]=1
    }
    ct:=0
    for i:=0;i<len(words);i++{
        for j:=0;j<len(words[i]);j++{
            _, boolean := allow [string(words[i][j])]
            if boolean ==false{
                ct --
                break
            }
        }
        ct++
    }
    fmt.Println(allow)
    return ct
}