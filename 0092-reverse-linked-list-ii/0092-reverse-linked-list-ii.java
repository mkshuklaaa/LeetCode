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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;

        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        for (int i = 0; i < left - 1; i++) {
            temp = temp.next;
        }

        ListNode leftNode = temp.next;
        ListNode rightNode = leftNode;

        for (int i = 0; i < right - left; i++) {
            rightNode = rightNode.next;
        }

        ListNode afterRightNode = rightNode.next;

        rightNode.next = null;

        ListNode rev = reverse(leftNode);

        temp.next = rev;
        leftNode.next = afterRightNode;

        return dummy.next;
    }
}