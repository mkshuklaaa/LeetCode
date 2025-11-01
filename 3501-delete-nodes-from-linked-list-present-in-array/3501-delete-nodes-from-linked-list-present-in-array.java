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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode temp = head;
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        for(int i=0;i<nums.length;i++) set.add(nums[i]);

        while(temp!=null){
            if(!set.contains(temp.val)){
                ListNode newNode = new ListNode(temp.val);
                ans.next = newNode;
                ans = ans.next;
            }
            temp=temp.next;
        }

        return dummy.next;
        
    }
}