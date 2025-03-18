class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        ArrayList <Integer> ting = new ArrayList <>();
        for(int j=0; j<n; j++){
            if(nums[j]!=j+1){
                ting.add(j+1);
            }
        }
        return ting;
    }
}