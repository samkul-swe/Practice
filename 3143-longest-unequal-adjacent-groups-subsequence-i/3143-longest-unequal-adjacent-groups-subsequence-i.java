class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int i = 0, j = 1;
        List<String> answer = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        answer.add(words[i]);
        while(j < groups.length) {
            if (groups[i] != groups[j]) {
                answer.add(words[j]);
                i = j;
                j ++;
            } else {
                j ++;
            }
        }
        return answer;
    }
}