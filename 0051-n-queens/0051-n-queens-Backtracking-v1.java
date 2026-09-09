class Solution {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        find(board, 0, new ArrayList<>());
        return res;
    }

    void find(char[][] board, int row, List<String> curr) {
        if (row == board.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                curr.add(new String(board[row]));
                find(board, row + 1, curr);
                curr.remove(curr.size() - 1);
                board[row][i] = '.';
            }
        }
    }

    boolean isSafe(char[][] board, int row, int col) {

        int n = board.length;

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}