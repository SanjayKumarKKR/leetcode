func kidsWithCandies(candies []int, extraCandies int) []bool {
    max :=0
    for i:=0;i<len(candies);i++{
        if candies[i]>max{
            max=candies[i]
        }
    }
    ans := make([]bool,len(candies))
    for i:=0;i<len(candies);i++{
        if candies[i]+extraCandies>=max{
            ans[i]=true
        }else{
            ans[i]=false
        }
    }
                        
    return ans;
}