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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int ct=0;
        ListNode node = head;
        while(node!=null){
            node=node.next;
            ct++;
        }
        System.out.println(ct);
        ListNode prev =null;
        ListNode curr =head;
        n=ct-n;
        if(n==0){
            return head.next;
        }
        while(n!=0){
            prev=curr;
            curr =curr.next;
            n--;
        }
        prev.next = curr.next;
        return head;
    }
}