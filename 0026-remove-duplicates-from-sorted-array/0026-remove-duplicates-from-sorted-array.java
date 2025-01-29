class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int i = 0, j = 1;
        while (i < j && j < nums.length) {
            if (nums[i] == nums[j]) {
                j ++;
            } else {
                nums[i + 1] = nums[j];
                count ++;
                i ++;
                if (i == j ) {
                    j ++;
                }
            }
        }
        return count + 1;
    }
}