# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head

     
        freq = {}
        temp = head
        while temp:
            freq[temp.val] = freq.get(temp.val, 0) + 1
            temp = temp.next


        dummy = ListNode(0)
        temp2 = dummy
        temp = head

        while temp:
            if freq[temp.val] == 1:
                temp2.next = ListNode(temp.val)
                temp2 = temp2.next
            temp = temp.next

        return dummy.next