class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        for (int num : nums) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        
        for (Map.Entry<Integer,Integer> entry : count.entrySet()) {
            if (entry.getValue()%2 != 0) {
                return false;
            }
        }
        return true;
    }
}