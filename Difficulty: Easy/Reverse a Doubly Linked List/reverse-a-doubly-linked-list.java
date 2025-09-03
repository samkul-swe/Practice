/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        while (head != null) {
            Node temp = head.next;
            head.next = head.prev;
            head.prev = temp;
            if (temp == null) return head;
            head = temp;
        }
        return head;
    }
}