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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int size =0;        
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        temp = head;
        int pos = k % size;
        if (pos == 0) return head;
        for(int i=0;i<pos;i++){
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=head;
            head=temp;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=null;
        }return head;        
    }
}