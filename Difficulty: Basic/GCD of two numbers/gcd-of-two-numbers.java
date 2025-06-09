
class Solution {
    public static int gcd(int a, int b) {
        // code here
        return a%b > 0? gcd(b,a%b) : b;
    }
}
