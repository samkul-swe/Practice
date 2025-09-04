/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int[] count = {0,0,0};
        Node temp = head;
        while (temp != null) {
            count[temp.data]++;
            temp = temp.next;
        }
        
        Node tempTemp = head;
        int pointer = 0;
        while (tempTemp != null) {
            if ((count[pointer] == 0) && (pointer < 3)) {
                pointer ++;
            }
            if (count[pointer] > 0) {
                tempTemp.data = pointer;
                count[pointer]--;
                tempTemp = tempTemp.next;
            }
        }
        return head;
    }
}