class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int b=nums.length;
        int []arr=new int[b];
        int a=0;
        for(int i=0;i<b;i++){
            if(nums[i]<pivot){
                arr[a++]=nums[i];
            }
        }
         for(int i=0;i<b;i++){
            if(nums[i]==pivot){
                arr[a++]=nums[i];
            }
        }
         for(int i=0;i<b;i++){
            if(nums[i]>pivot){
                arr[a++]=nums[i];
            }
        }
        return arr;
    }
}