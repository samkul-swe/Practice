class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int answer = 1;
        long sqr = 1;
        while (sqr < x) {
            sqr = (long)answer * (long)answer;
            if (sqr == x) {
                return answer;
            } else if (sqr > x) {
                return answer - 1;
            }
            answer += 1;
        }
        return answer;
    }
}