class Solution {
    public int[] twoSum(int[] nums, int target) {
        int answer[] = new int[2];
        int check = 0;
        for (int i = check + 1; i < nums.length; i++) {
            if (target - nums[check] == nums[i] && check != i) {
                answer[0] = check;
                answer[1] = i;
                break;
            } else if (i == nums.length - 1) {
                check ++;
                i = 0;
            }
        }
        return answer;
    }
}