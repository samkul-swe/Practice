class Solution {
    public int totalElements(int[] arr) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right],map.getOrDefault(arr[right],0) + 1);
            if (map.size() > 2) {
                map.put(arr[left],map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left ++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}