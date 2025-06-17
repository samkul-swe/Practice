class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i ++) {
            if (map.containsKey(target-numbers[i])) {
                answer[0] = map.get(target-numbers[i]) + 1;
                answer[1] = i + 1;
            } else {
                map.put(numbers[i],i);
            }
        }
        return answer;
    }
}