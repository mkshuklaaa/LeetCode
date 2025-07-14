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
        if(head==null || head.next==null) return head;
        Map<Integer,Integer> map = new HashMap<>();

        ListNode temp = head;

        while(temp!=null){
            if(!map.containsKey(temp.val)){
                map.put(temp.val,1);
            }else{
                map.put(temp.val,map.get(temp.val)+1);
            }
            temp=temp.next;
        }

        temp=head;

        ListNode newNode = new ListNode(0);
        ListNode temp2=newNode;

        while(temp!=null){
            
            if(map.get(temp.val)==1){
                ListNode dummy = new ListNode(temp.val);
                temp2.next= dummy;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        temp2=newNode;
        while(temp2!=null){
            System.out.print(temp2.val);
            temp2=temp2.next;
        }
        return newNode.next;        
        
    }
}