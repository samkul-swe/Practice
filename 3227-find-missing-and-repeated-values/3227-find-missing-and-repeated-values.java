class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> count = new HashMap<>();
        int[] answer = new int[2];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j ++) {
                if (count.containsKey(grid[i][j])) {
                    answer[0] = grid[i][j];
                } else {
                    count.put(grid[i][j],1);
                }
            }
        }

        for (int i = 1; i<= grid.length*grid.length; i++) {
            if (!(count.containsKey(i))) {
                answer[1] = i;
                break;
            }
        }
        return answer;
    }
}