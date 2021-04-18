/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
import ("math"; "strconv")
func getDecimalValue(head *ListNode) int {
    sum :=""
    for head!=nil{
        sum =sum+strconv.Itoa(head.Val)
        head =head.Next
    }
    fmt.Println(sum)
    ans:=0
    // t:=sum
    ind:=0
    for ind!=len(sum){
        digit, _ := strconv.Atoi(string(sum[len(sum)-ind-1]))
        ans = ans + int(digit) * int(math.Pow(2,float64(ind))) 
        ind++
        // fmt.Println(string(sum[len(sum)-ind-1]),10, 32))
    }
    
    return ans
}