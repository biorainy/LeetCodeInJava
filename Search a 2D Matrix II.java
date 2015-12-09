public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows= matrix.length;
        int cols = matrix[0].length;
        
        int maxRow = -1, maxCol = -1;
        
        for (int i  = 0; i < rows; i++) {
            if (matrix[i][0] <= target)
                maxRow = i;
            else
                break;
        }
        
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] <= target) {
                maxCol = j;
            } else
                break;
        }
        
        for (int i = 0; i <= maxRow; i++) {
            for (int j = 0; j <= maxCol; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        
        return false;
    }
}