class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            if (!(numbers.contains(num))) {
                numbers.add(num);
            }
        }
        numbers.sort(null);
        if (numbers.size() < 3) {
            return numbers.get(numbers.size()-1);
        }
        return numbers.get(numbers.size()-3);
    }
}