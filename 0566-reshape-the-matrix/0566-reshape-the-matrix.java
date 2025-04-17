class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length == r*c) {
            int[][] new_mat = new int[r][c];
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < mat.length; i ++) {
                for (int j = 0; j < mat[0].length; j ++) {
                    numbers.add(mat[i][j]);
                }
            }

            int k = 0;
            for (int i = 0; i < r; i ++) {
                for (int j = 0; j < c; j ++) {
                    new_mat[i][j] = numbers.get(k);
                    k ++;
                }
            }
            return new_mat;
        }
        return mat;
    }
}