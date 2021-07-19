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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){return null;}
        if(head.next!=null && head.val == head.next.val){
            head = head.next;
        }
        ListNode node =head;
        ListNode prev = null;
        
        while(node!=null) {
            while(node !=null && prev!=null && prev.val == node.val){
                prev.next = node.next;
                node=node.next;
            }
            // System.out.println(node.val);
            if(node==null){ break;}
            prev=node;
            node=node.next;
        }
        
        return head;
    }
}