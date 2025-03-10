class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        int maxKey = -1;
        for (int i = 0; i < nums.length; i++) {
            if(count.containsKey(nums[i])) {
                count.put(nums[i],count.get(nums[i]) + 1);
            } else {
                count.put(nums[i],1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                if ((maxKey != -1) && (count.get(maxKey) < entry.getValue())) {
                    maxKey = entry.getKey();
                } else if (maxKey == -1) {
                    maxKey = entry.getKey();
                } else if (count.get(maxKey) == entry.getValue()) {
                    if (maxKey > entry.getKey()) {
                        maxKey = entry.getKey();
                    }
                }
            }
        }

        return maxKey;
    }
}