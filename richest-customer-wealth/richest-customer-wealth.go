func maximumWealth(accounts [][]int) int {
    high :=0
    for i:=0;i<len(accounts);i++{
        sum:=0
        for j:=0;j<len(accounts[i]);j++{
            sum=sum+accounts[i][j]
        }
        if high<sum{
            high=sum
        }
    }
    return high
}