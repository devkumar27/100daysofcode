// LC48 - https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        //reverse every column
        for(int i=0; i<matrix.length; i++) {
            int startRow = 0;
            int endRow = matrix.length - 1;
            while(startRow<endRow) {
               int temp = matrix[startRow][i];
               matrix[startRow][i] = matrix[endRow][i];
               matrix[endRow][i] = temp;
               startRow++;
               endRow--;
            }
        }
        //transpose the matrix
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                if(i<j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }
}
