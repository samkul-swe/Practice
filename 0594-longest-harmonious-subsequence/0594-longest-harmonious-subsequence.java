class Solution {
    public int findLHS(int[] nums) {
        // get frequencies
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        // get max
        int maxLen = 0;
        for(int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                maxLen = Math.max(maxLen, map.get(num) + map.get(num + 1));
            }
        }

        return maxLen;
    }
}