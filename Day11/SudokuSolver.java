//LC37 - https://leetcode.com/problems/sudoku-solver/
class Solution {
    private boolean solver(char[][] board) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(board[i][j] == '.') {

                    for(char k='1'; k<='9'; k++) {
                        
                        if(isValid(board, i, j, k)) {
                            board[i][j] = k;
                            if(solver(board)) {
                                return true;
                            }
                            else {
                                board[i][j] = '.';
                            }
                        }
                        
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char k) {
        for(int i=0; i<9; i++) {
            if(board[i][col] == k) {
                return false;
            }
            if(board[row][i] == k) {
                return false;
            }
            if(board[3 * (row/3) + i/3][3 * (col/3) + i%3] == k) {
                return false;
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solver(board);
    }
}
