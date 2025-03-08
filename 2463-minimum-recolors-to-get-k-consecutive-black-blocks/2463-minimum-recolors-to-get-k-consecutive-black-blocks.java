class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int right = left + k;
        int w_count = 0, b_count = 0;
        int min_count = 1000;

        while (right <= blocks.length()) {

            for (int i = left; i < right; i++) {
                if (blocks.charAt(i) == 'W') {
                    w_count ++;
                } else {
                    b_count ++;
                }
            }

            if (b_count >= k) {
                return 0;
            }

            if (min_count > w_count) {
                min_count = w_count;
            }

            left ++;
            right ++;
            w_count = 0;
            b_count = 0;
        }
        return min_count;
    }
}