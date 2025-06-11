class Solution {
    public int maxFrequencyElements(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int count = 0;
        for (int num : map.values()) {
            if (num > maxFreq) {
                maxFreq = num;
            }
        }
        for (int num : map.values()) {
            if (num == maxFreq) {
                count ++;
            }
        }

        return count * maxFreq;
    }
}