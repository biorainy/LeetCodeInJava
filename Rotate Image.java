public class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length ==0)
            return;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            rotate(matrix[i]);
        }
        
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1 - i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[rows - 1 - j][cols - 1 - i];
                matrix[rows -1 - j][cols - 1 - i] = t;
            }
        }
    }
    
    public void rotate(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }
    }
    
    
}