class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i=0,j=1;
        int count = 0;
        while (i < j && j < nums.length) {
            if (nums[i] == nums[j]) {
                count ++;
                j ++;
            } else {
                j ++;
            }
            if (j == nums.length) {
                i++;
                j = i+1;
            }
        }
        return count;
    }
}