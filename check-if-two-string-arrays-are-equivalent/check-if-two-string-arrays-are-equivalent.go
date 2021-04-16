func arrayStringsAreEqual(word1 []string, word2 []string) bool {
    w1:=""
    w2:=""
    for i:=0;i<len(word1);i++{
        w1+=word1[i]
    }
    for i:=0;i<len(word2);i++{
        w2+=word2[i]
    }
    
    if w1==w2{
        return true
    }else{
        return false
    }
}