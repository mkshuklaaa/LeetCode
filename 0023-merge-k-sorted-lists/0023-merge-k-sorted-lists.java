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
    public ListNode mergeKLists(ListNode[] lists) {
        HashMap<Integer,Integer> map = new HashMap<>(); 
        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                if(map.containsKey(temp.val)){
                map.put(temp.val,map.get(temp.val)+1);
                }else{
                    map.put(temp.val,1);
                }
                temp=temp.next;
            }
        }

        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        for(int key : sortedKeys){
            while(map.get(key)>0){
                ListNode newNode = new ListNode(key);
                res.next=newNode;
                res=res.next;
                map.put(key,map.get(key)-1);
            }
        }
        return dummy.next;
        
    }
}