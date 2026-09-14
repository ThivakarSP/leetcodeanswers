class Solution {
    public int[][] sortMatrix(int[][] grid) {

        int n = grid.length;

        for (int row = 0; row < n; row++) {
            PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

            int r = row;
            int c = 0;

            while (r < n && c < n) {
                pq.add(grid[r][c]);
                r++;
                c++;
            }

            r = row;
            c = 0;

            while (r < n && c < n) {
                grid[r][c] = pq.poll();
                r++;
                c++;
            }
        }

        for (int col = 1; col < n; col++) {
            PriorityQueue<Integer> pq =
                new PriorityQueue<>();

            int r = 0;
            int c = col;

            while (r < n && c < n) {
                pq.add(grid[r][c]);
                r++;
                c++;
            }

            r = 0;
            c = col;

            while (r < n && c < n) {
                grid[r][c] = pq.poll();
                r++;
                c++;
            }
        }

        return grid;
    }
}