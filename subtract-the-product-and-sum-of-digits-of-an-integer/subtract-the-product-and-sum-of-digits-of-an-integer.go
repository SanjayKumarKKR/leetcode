func subtractProductAndSum(n int) int {
    sum :=0
    prod :=1
    for n>0{
        digit := n%10
        sum =sum + digit
        prod = prod * digit
        n=n/10
    }
    return (prod-sum)
}