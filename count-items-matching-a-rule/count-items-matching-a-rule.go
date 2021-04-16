func countMatches(items [][]string, ruleKey string, ruleValue string) int {
    ct:=0
    sel:=0
    if ruleKey=="type"{
        sel=0
    }else if ruleKey=="color"{
        sel=1
    }else if ruleKey=="name"{
        sel=2
    }
    
    for i:=0;i<len(items);i++{
        if items[i][sel]==ruleValue {
            ct++
        }        
    }

    return ct
    
}