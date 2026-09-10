class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] board){
        for(int row = 0;row<9;row++){
            for(int col = 0; col < 9; col++){
                if(board[row][col]!='.'){
                    continue;
                }

                for(char i='1';i<='9';i++){
                    if(isValid(board,row,col,i)){
                        board[row][col] = i;
                        if(solve(board)){
                            return true;
                        }
                        board[row][col] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }

    boolean isValid(char[][] board,int row,int col,int n){
        for(int i=0;i<9;i++){
            if(board[row][i] == n){
                return false;
            }
        }

        for(int i=0;i<9;i++){
            if(board[i][col] == n){
                return false;
            }
        }

        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == n) {
                    return false;
                }
            }
        }

        return true;
    }
}