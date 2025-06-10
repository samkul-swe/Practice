class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num - 1)) {
                List<Integer> list = map.get(num - 1);
                list.add(num);
                map.remove(num - 1);
                map.put(num, list);
            } else {
                if (map.containsKey(num)) {
                    // do nothing
                } else {
                    map.put(num,new ArrayList<Integer>());
                    map.get(num).add(num);
                }
            }
        }

        int maxLength = Integer.MIN_VALUE;
        for (int num : map.keySet()) {
            if (map.get(num).size() > maxLength) {
                maxLength = map.get(num).size();
            }
        }

        return maxLength;
    }
}