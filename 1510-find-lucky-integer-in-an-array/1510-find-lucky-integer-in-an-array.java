class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a,map.getOrDefault(a,0) + 1);
        }

        int maxKey = -1;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                maxKey = Math.max(maxKey,entry.getKey());
            }
        }
        return maxKey;
    }
}