class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;
        for(int right = 0; right < arr.length; right++) {
            map.put(arr[right],map.getOrDefault(arr[right],0) + 1);
            while (map.size() > k) {
                map.put(arr[left],map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left ++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
