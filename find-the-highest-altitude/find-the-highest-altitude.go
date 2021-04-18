func largestAltitude(gain []int) int {
    sum:=0
    max:=0
    for i:=0;i<len(gain);i++{
        sum+=gain[i]
        if sum>max{
            max=sum
        }
    }
    return max
}