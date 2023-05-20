class Solution {
    public int aliveNeighbours(int[][] mat, int i, int j) {
        int count = 0;
        int[] dx = {0,0,1,1,1,-1,-1,-1};
        int[] dy = {1,-1,1,-1,0,0,1,-1};
        for(int k=0; k<8; k++) {
            int x = i+dx[k];
            int y = j+dy[k];
            if(x>-1 && y>-1 && x<mat.length && y<mat[0].length && mat[x][y] == 1) {
                count++;
            }
        }
        return count;
    }
    public void gameOfLife(int[][] board) {
        int[][] ref = new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                ref[i][j] = board[i][j];
            }
        }
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {  
                int an = aliveNeighbours(ref, i, j);
                if(ref[i][j] == 1) {
                    if(an < 2 || an > 3) {
                        board[i][j] = 0;
                    }
                }
                else {
                    if(an == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}
