class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        int length = 1;
        int nrow = 0;
        while (nrow < numRows) {
            List<Integer> ans = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                if (i == 0 || i == length - 1) {
                    ans.add(1);
                } else {
                    ans.add(answer.get(nrow - 1).get(i-1) + answer.get(nrow - 1).get(i));
                }
            }
            answer.add(ans);
            nrow ++;
            length++;
        }
        return answer;
    }
}