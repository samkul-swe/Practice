class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        int sum = 1;
        int min = nums[0];
        while (sum > 0) {
            min = 1000;
            sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if(min > nums[i] && nums[i] != 0) {
                    min = nums[i];
                }
                sum += nums[i];
            }

            if (sum == 0) {
                return count;
            } else {
                count ++;
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] - min <= 0) {
                    nums[i] = 0;
                } else {
                    nums[i] -= min;
                }
            }
        }
        return count;
    }
}