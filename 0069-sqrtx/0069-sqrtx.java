class Solution {
    public int mySqrt(int x) {
        long l = 0,r = x;
        long res = 0;
        long m;
        while (l <= r) {
            m = l + ((r-l)/2);
            if (m*m > x) {
                r = m-1;
            } else if (m*m < x) {
                l = m+1;
                res = m;
            } else {
                return (int)m;
            }
        }
        return (int)res;
    }
}