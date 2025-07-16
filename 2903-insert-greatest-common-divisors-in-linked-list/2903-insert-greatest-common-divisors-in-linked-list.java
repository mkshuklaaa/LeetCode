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
    public int gcd(int x,int y){
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;
        ListNode h =head;

        while(h.next!=null){
            ListNode newNode1 = new ListNode(h.val);
            temp.next=newNode1;
            temp=temp.next;
            ListNode newNode2 = new ListNode(gcd(h.val,h.next.val));
            temp.next=newNode2;
            temp=temp.next;
            h=h.next;
        }
        temp.next=h;
        return dummy.next;

        
    }
}