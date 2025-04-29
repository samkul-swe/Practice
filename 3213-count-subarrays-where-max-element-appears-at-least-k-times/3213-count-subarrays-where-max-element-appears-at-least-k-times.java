class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        int left = 0;
        long maxOccurence = 0;
        long result = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == max) {
                maxOccurence ++;
            }
            while (maxOccurence >= k) {
                if (nums[left] == max) {
                    maxOccurence --;
                }
                left ++;
            }
            result += left;
        }
        return result;
    }
}