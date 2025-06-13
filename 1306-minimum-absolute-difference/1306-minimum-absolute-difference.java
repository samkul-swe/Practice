class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> answer = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i ++) {
            if (arr[i+1] - arr[i] < minDiff) {
                minDiff = arr[i+1] - arr[i];
            }
        }
        for (int i = 0; i < arr.length - 1; i ++) {
            if (arr[i+1] - arr[i] == minDiff) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                answer.add(temp);
            }
        }
        return answer;
    }
}