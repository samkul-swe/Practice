class Solution {
    public int hammingWeight(int n) {
        int value = 0;
        while(n > 0) {
            if (n%2 == 1) {
                value ++;
            }
            n /= 2;
        }
        return value;
    }
}