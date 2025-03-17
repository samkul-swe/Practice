class Solution {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        int zeroIndex = -1;
        int numIndex = 0;
        while (numIndex < nums.length) {
            if ((zeroIndex == -1) && (nums[numIndex] == 0)) {
                zeroIndex = numIndex;
                numIndex ++;
            } else if ((zeroIndex != -1) && (nums[numIndex] == 0)) {
                numIndex ++;
            } else if ((zeroIndex == -1) && (nums[numIndex] != 0)) {
                numIndex ++;
            } else if ((zeroIndex != -1) && (nums[numIndex] != 0)) {
                int temp = nums[numIndex];
                nums[numIndex] = nums[zeroIndex];
                nums[zeroIndex] = temp;
                numIndex = zeroIndex;
                zeroIndex = -1;
            }
            System.out.println(numIndex + " " + zeroIndex);
        }

        return nums;
    }
}