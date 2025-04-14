class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increasingLength = 1;
        int decreasingLength = 1;
        int lastIincr = 0;
        int lastIdec = 0;
        int i = 0, j = 1;
        int maxVal = 1;
        while((i < j) && (j < nums.length)) {
            if (nums[i] < nums[j]) {
                if (i - lastIincr != 1) {
                    increasingLength = 1;
                }
                increasingLength ++;
                lastIincr = i;
            } else if (nums[i] > nums[j]) {
                if (i - lastIdec != 1) {
                    decreasingLength = 1;
                }
                decreasingLength ++;
                lastIdec = i;
            }
            i ++;
            j ++;
            maxVal = Math.max(Math.max(increasingLength, decreasingLength), maxVal);
        }
        return maxVal;
    }
}