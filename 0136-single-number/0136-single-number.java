class Solution {
    public int singleNumber(int[] nums) {
        int slow = 0;
        int fast = 1;
        int ansIndex = -238;
        while ((slow < fast) && (fast < nums.length)) {
            if ((nums[fast] == nums[slow]) && (nums[fast] != -238)) {
                nums[fast] = -238;
                nums[slow] = -238;
                slow ++;
                fast = slow + 1;
            } else if (nums[slow] == -238) {
                slow ++;
                fast = slow + 1;
            } else {
                fast ++;
            }
            if ((fast == nums.length) && (nums[slow] == -238)) {
                slow ++;
                fast = slow + 1;
            }
            if ((fast == nums.length) && (slow != nums.length - 1)) {
                ansIndex = slow;
                slow ++;
                fast = slow + 1;
            }
        }
        if (ansIndex != -238) {
            return nums[ansIndex];
        }
        return nums[slow];
    }
}