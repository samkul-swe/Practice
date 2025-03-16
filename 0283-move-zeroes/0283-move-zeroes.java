class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        int numIndex = 0;
        int temp;
        while(numIndex < nums.length) {
            if ((nums[numIndex] == 0) && (zeroIndex == -1)) {
                // zeroIndex is not found, so set it
                zeroIndex = numIndex;
                numIndex ++;
            } else if ((nums[numIndex] != 0) && (zeroIndex != -1)) {
                //number is not zero and zeroIndex is set
                temp = nums[numIndex];
                nums[numIndex] = nums[zeroIndex];
                nums[zeroIndex] = temp;
                numIndex = zeroIndex;
                zeroIndex = -1;
            } else if ((nums[numIndex] == 0) && (zeroIndex != -1)) {
                numIndex ++;
            } else if ((nums[numIndex] != 0) && (zeroIndex == -1)) {
                numIndex ++;
            }
        }
    }
}