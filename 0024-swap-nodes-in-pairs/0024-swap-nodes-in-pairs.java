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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newNode = new ListNode(0);
        ListNode t1=newNode;
        ListNode t2=head;
        while(t2!=null && t2.next!=null){
            ListNode t3 = t2.next;
            ListNode t4 = t2.next.next;

            t1.next=t3;
            t3.next=t2;
            t1=t2;
            t2=t4;
        }
        t1.next = t2;
        return newNode.next;

    }
}