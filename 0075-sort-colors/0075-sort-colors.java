class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int k = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int num = 0;
            while (num < entry.getValue()) {
                nums[k] = entry.getKey();
                k ++;
                num ++;
            }
        }
    }
}