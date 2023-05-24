class Solution {
    private void findSols(int col, int n, char[][] board, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal, List<List<String>> ans, List<String> sol) {
        if(col == n) {
            ans.add(construct(board));
            return;
        }
        for(int row=0; row<n; row++) {
            if(leftRow[row] == 0 && lowerDiagonal[row+col] == 0 && upperDiagonal[n-1+col-row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row+col] = 1;
                upperDiagonal[n-1+col-row] = 1;
                findSols(col+1, n, board, leftRow, upperDiagonal, lowerDiagonal, ans, sol);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row+col] = 0;
                upperDiagonal[n-1+col-row] = 0;
            }
        }
    }

    private List<String> construct(char[][] board) {
        List<String> sol = new ArrayList<>();
        for(int i=0; i<board.length; i++) {
            String row = new String(board[i]);
            sol.add(row);
        }
        return sol;
    }
     
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        int[] upperDiagonal = new int[2*n - 1];
        int[] lowerDiagonal = new int[2*n - 1];
        int[] leftRow = new int[n];
        findSols(0, n, board, leftRow, upperDiagonal, lowerDiagonal, ans, new ArrayList<>());
        return ans;
    }
}
