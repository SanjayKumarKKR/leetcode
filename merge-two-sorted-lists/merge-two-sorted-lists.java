/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode n1 =l1;
        ListNode n2 =l2;
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        while(n1!=null && n2!=null){
            if(n1.val<=n2.val){
                dummy.next = n1.val<=n2.val ? n1 : n2;
                n1=n1.next;
            }else{
                dummy.next = n1.val<=n2.val ? n1 : n2;
                n2=n2.next;
            }
            dummy = dummy.next;
        }
        while(n1!=null){
            dummy.next = n1;
            n1=n1.next;
            dummy=dummy.next;
        }
         while(n2!=null){
             dummy.next = n2;
            n2=n2.next;
             dummy=dummy.next;
        }
    
        
        return ans.next;
    }
}