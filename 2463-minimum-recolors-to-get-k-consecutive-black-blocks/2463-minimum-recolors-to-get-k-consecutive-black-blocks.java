class Solution {
    public int minimumRecolors(String blocks, int k) {
        int b_count = 0;
        int min_count = 1000;

        for (int i = 0; i < blocks.length(); i++) {
            if (i-k >= 0 && blocks.charAt(i-k) == 'B') {
                b_count --;
            }
            if (blocks.charAt(i) == 'B') {
                b_count ++;
            }
            min_count = Math.min(min_count, k-b_count);
        }
        return min_count;
    }
}