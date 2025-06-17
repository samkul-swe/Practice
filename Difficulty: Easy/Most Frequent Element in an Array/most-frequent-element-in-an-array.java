class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a,0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int maxKey = Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (max == entry.getValue()) {
                if (maxKey < entry.getKey()) {
                    maxKey = entry.getKey();
                }
            }
        }
        return maxKey;
    }
}