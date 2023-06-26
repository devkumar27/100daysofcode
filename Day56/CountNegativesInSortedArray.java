class Solution {
    public int countNegatives(int[][] grid) {
        int rows = 0;
        int cols = grid[0].length - 1;
        int negatives = 0;
        while(rows<grid.length && cols>=0) {
            if(grid[rows][cols] < 0) {
                negatives += grid.length - rows;
                cols--;
            }
            else {
                rows++;
            }
        }

        return negatives;
    }
}
