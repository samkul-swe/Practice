class Solution {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    sum += 4;
                    // above
                    if (i + 1 < grid.length) {
                        if (grid[i+1][j] == 1) {
                            sum --;
                        }
                    }
                    // right
                    if (j + 1 < grid[i].length) {
                        if (grid[i][j+1] == 1) {
                            sum --;
                        }
                    }
                    // left
                    if (j - 1 > -1) {
                        if (grid[i][j-1] == 1) {
                            sum --;
                        }
                    }
                    // below
                    if (i - 1 > -1) {
                        if (grid[i-1][j] == 1) {
                            sum --;
                        }
                    }
                }
            }
        }

        return sum;
    }
}