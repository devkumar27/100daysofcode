class Solution {
    public int getYDiff(int[] x, int[] y) {
        return y[1] - x[1];
    }
    public int getXDiff(int[] x, int[] y) {
        return y[0] - x[0];
    }
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = getXDiff(coordinates[0], coordinates[1]);
        int dy = getYDiff(coordinates[0], coordinates[1]);
        for(int i=2; i<coordinates.length; i++) {
            if(dy*getXDiff(coordinates[0], coordinates[i]) != dx*getYDiff(coordinates[0], coordinates[i])) {
                return false;
            }
        }
        return true;
    }
}
