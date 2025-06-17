// User function Template for Java
class Solution {

    // Function to find the intersection of two arrays
    ArrayList<Integer> intersection(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while ((i < a.length) && (j < b.length)) {
            if (a[i] < b[j]) {
                i ++;
            } else if (a[i] > b[j]) {
                j ++;
            } else if (a[i] == b[j]) {
                if (list.contains(b[j])) {
                    i ++;
                    j ++;
                } else {
                    list.add(a[i]);
                    i ++;
                    j ++;
                }
            }
        }
        return list;
    }
}