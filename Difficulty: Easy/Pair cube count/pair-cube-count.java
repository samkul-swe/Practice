// User function Template for Java

class Solution {
    static int pairCubeCount(int n) {
        // code here
        int count = 0;
        for (int i = 1; i<= Math.cbrt(n); i++) {
            int cb = i * i * i;
            int diff = n - cb;
            int cbrtDiff = (int) Math.cbrt(diff);
            if (cbrtDiff * cbrtDiff * cbrtDiff == diff) {
                count ++;
            }
        }
        return count;
    }
};