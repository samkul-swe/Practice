import math
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        check_for_next_node = True
        total = ListNode(0,None)
        head = total
        carry = 0
        while check_for_next_node :
            node_sum = 0
            if (l1 != None and l2 != None) :
                node_sum = l1.val + l2.val + carry
                l1 = l1.next
                l2 = l2.next
            elif (l1 != None and l2 == None) :
                node_sum = l1.val + carry
                l1 = l1.next
            elif (l1 == None and l2 != None) :
                node_sum = l2.val + carry
                l2 = l2.next
            elif (l1 == None and l2 == None and carry != 0) :
                node_sum = carry
                check_for_next_node = False
            head.val = math.floor(node_sum%10)
            carry = math.floor(node_sum/10)
            if (check_for_next_node) :
                if (l1 == None and l2 == None and carry == 0) :
                    break
                head.next = ListNode(0,None)
                head = head.next
        return total

        