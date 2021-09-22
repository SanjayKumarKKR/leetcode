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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        
        ListNode smallnode = small;
        ListNode bignode = big;
        ListNode node = head;
        while(node!=null){
            if(node.val<x){
                smallnode.next = node;
                smallnode = smallnode.next;
            }else{
                bignode.next = node;
                bignode = bignode.next;
            }
            node= node.next;
        }
        
        smallnode.next = big.next;
        bignode.next = null;
        return small.next;
    }
}