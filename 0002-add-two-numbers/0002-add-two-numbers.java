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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode total = new ListNode();
        ListNode head = total; //pointer to traverse total
        int sum, carry = 0;
        boolean checkForNextNode = true;
        while (checkForNextNode) {
            sum = 0;
            if (l1!= null && l2!= null) {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l2 == null && l1 != null) {
                sum = l1.val + carry;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                sum = l2.val + carry;
                l2 = l2.next;
            } else if (l1 == null && l2 == null && carry != 0) {
                sum = carry;
                checkForNextNode = false;
            }
            head.val = sum%10;
            carry = sum/10;
            if (checkForNextNode) {
                if (l1 == null && l2 == null && carry == 0) {
                    break;
                }
                head.next = new ListNode();
                head = head.next;
            }
        }
        return total;
    }
}