/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
       List<Integer> list = new ArrayList<>();
        for (Node a : arr) {
            while (a != null) {
                list.add(a.data);
                a = a.next; // ← This line was missing! Move to next node
            }
        }
        
        Collections.sort(list);
        
        // Also fix the result construction
        Node head = new Node(list.get(0)); // Don't use dummy value
        Node temp = head;
        
        for (int i = 1; i < list.size(); i++) { // Start from index 1
            temp.next = new Node(list.get(i));
            temp = temp.next;
        }
        
        return head;
    }
}