class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int min = nums[0]; 
        for(int j=1; j<nums.length; j++)
        {
        if(nums[j]>min)
        max = Math.max(max, Math.abs(nums[j]-min));
        min = Math.min(min, nums[j]);
        }    
        return max;
    }
}