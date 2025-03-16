class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        List<Integer> result = new ArrayList<>();
        for (int num : nums1Set) {
            if (nums2Set.contains(num)) {
                result.add(num);
            }
        }
        int[] answer = new int[result.size()];
        int k = 0;
        for (int num : result) {
            answer[k] = num;
            k++;
        }
        return answer;
    }
}