/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node reverseKGroup(Node head, int k) {
        // code here
        
        if(head == null || k == 1){
            return head;
        }

        //  reverse first k nodes       
        Node curr = head;
        Node next = null;
        Node prev = null;
        int count = 0;
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        //  reverse remaining nodes using recursion 
        if(next != null){
            head.next = reverseKGroup(next,k);
        }
        //  return new head 
        return prev; 
    }
}