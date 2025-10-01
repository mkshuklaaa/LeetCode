class Solution {
    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null) {
            return head;
        }
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

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode t1 = head;
        int size = 0;
        while(t1 != null){
            t1 = t1.next;
            size++;
        }

        ListNode middle = head;
        for (int i = 0; i < (size - 1) / 2; i++) {
            middle = middle.next;
        }

        ListNode secondHalf = middle.next;
        middle.next = null; // Break the list into two halves

        ListNode rev = reverseList(secondHalf);

        t1 = head;
        ListNode t2 = rev;

        while (t1 != null && t2 != null) {
            ListNode temp1 = t1.next;
            ListNode temp2 = t2.next;

            t1.next = t2;
            t2.next = temp1;

            t1 = temp1;
            t2 = temp2;
        }
    }
}