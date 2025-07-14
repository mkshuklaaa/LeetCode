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
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode h=head;

        while(h!=null){
            if(h.val<x){
                ListNode clone = new ListNode(h.val);
                temp.next=clone;
                temp=temp.next;
            }
            h=h.next;
        }
        h=head;

        while(h!=null){
            if(h.val>=x){
                ListNode clone = new ListNode(h.val);
                temp.next=clone;
                temp=temp.next;
            }h=h.next;        
        }
        return dummy.next;
    }
}