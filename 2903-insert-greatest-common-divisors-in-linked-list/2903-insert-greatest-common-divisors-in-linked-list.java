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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
        int gcdvalue =findgcd(temp.val,temp.next.val);
        ListNode adj = new ListNode(gcdvalue);
        adj.next=temp.next;
        temp.next=adj;
        temp=adj.next;
        }
        return head;

    }
    public int findgcd(int a,int b){
        if(b==0)return a;
        return findgcd(b,a%b);
    }
}