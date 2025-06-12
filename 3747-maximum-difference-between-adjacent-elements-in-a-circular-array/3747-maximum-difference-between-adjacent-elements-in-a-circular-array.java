class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (n > 1) {
            if (Math.abs(nums[i + 1] - nums[i]) > max) {
                max = Math.abs(nums[i+1] - nums[i]);
            }
            i ++;
            n --;
        }
        if (Math.abs(nums[nums.length - 1] - nums[0]) > max) {
            max = Math.abs(nums[nums.length - 1] - nums[0]);
        }
        return max;
    }
}