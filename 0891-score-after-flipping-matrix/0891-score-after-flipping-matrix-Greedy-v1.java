class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int score = m * (1 << (n - 1));

        for (int j = 1; j < n; j++) {
            int ones = 0;

            for (int i = 0; i < m; i++) {
                if (grid[i][j] == grid[i][0]) {
                    ones++;
                }
            }

            int maxOnes = Math.max(ones, m - ones);

            score += maxOnes * (1 << (n - j - 1));
        }

        return score;
    }
}