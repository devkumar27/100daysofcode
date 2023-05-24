//Solved at GFG Practice
// m is the given matrix and n is the order of matrix
class Solution {
    public static void helper(int[][] maze, boolean[][] vis, int n, int row, int col, String path, ArrayList<String> res, int[] drow, int[] dcol) {
        if(row==n-1 && col==n-1) {
            res.add(path);
            return;
        }
        String dir = "DRUL";
        for(int i=0; i<4; i++) {
            int nextRow = row + drow[i];
            int nextCol = col + dcol[i];
            if(nextRow>=0 && nextCol>=0 && nextRow<n && nextCol<n && !vis[nextRow][nextCol] && maze[nextRow][nextCol]==1) {
                vis[row][col] = true;
                helper(maze, vis, n, nextRow, nextCol, path+dir.charAt(i), res, drow, dcol);
                vis[row][col] = false;
            }
        }
    }
    
    public static ArrayList<String> findPath(int[][] maze, int n) {
        ArrayList<String> res = new ArrayList<>();
        boolean[][] vis = new boolean[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                vis[i][j] = false;
            }
        }
        int[] drow = {1,0,-1,0};
        int[] dcol = {0,1,0,-1};
        if(maze[0][0] == 1) helper(maze, vis, n, 0, 0, "", res, drow, dcol);
        return res;
    }
}
