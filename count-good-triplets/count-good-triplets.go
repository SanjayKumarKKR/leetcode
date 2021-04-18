func countGoodTriplets(arr []int, a int, b int, c int) int {
    ct:=0
    for i:=0;i<len(arr);i++{
        for j:=i+1;j<len(arr);j++{
            for k:=j+1;k<len(arr);k++{
                if int(math.Abs(float64(arr[i]-arr[j])))<=a &&  int(math.Abs(float64(arr[j]-arr[k])))<=b &&  int(math.Abs(float64(arr[i]-arr[k])))<=c {
                    ct++
                }
            }
        }
    }
    return ct
}