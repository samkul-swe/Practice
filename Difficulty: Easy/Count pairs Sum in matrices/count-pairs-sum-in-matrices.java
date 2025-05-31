class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < mat1.length; i ++) {
            for (int j = 0; j < mat1[i].length; j ++) {
                set.add(mat1[i][j]);
            }
        }
        
        for (int i = 0; i < mat2.length; i ++) {
            for (int j = 0; j < mat2[i].length; j ++) {
                if (set.contains(x - mat2[i][j])) {
                    count ++;
                }
            }
        }
        
        return count;
        
    }
}