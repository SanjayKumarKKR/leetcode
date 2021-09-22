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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val == val){
            head=head.next;
        }
        ListNode temp1 =head;
        ListNode node = head;
        ListNode prev = null;
        while(node!=null){
            if(node.val==val){
                prev.next = node.next;
            }else{
                prev = node;
            }
            node=node.next;
        }
        
        
        return temp1;
    }
}