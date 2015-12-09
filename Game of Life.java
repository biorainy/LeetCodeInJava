public class Solution {
    public void gameOfLife(int[][] board) {
        if (board.length == 0)
            return;
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int count = 0;
                if (i - 1 >= 0 && board[i-1][j] >= 1)
                    count++;
                if (i - 1 >= 0 && j - 1 >= 0 && board[i-1][j-1] >= 1)
                    count++;
                if (i - 1>= 0 && j + 1 < col && board[i-1][j+1] >= 1)
                    count++;
                if (j - 1 >=0 && board[i][j - 1] >= 1) 
                    count++;
                if (j + 1 < col && board[i][j + 1] >= 1)
                    count++;
                if (i + 1 < row && board[i+1][j] >= 1)
                    count++;
                if (i + 1 < row && j - 1 >= 0 && board[i+1][j-1] >= 1)
                    count++;
                if (i + 1 < row && j + 1 < col && board[i+1][j+1] >= 1)  
                    count++;
                    
                if ((count == 2 || count == 3) && board[i][j] == 1)
                    board[i][j] = 11;
                if (count == 3 && board[i][j] == 0)
                    board[i][j] = -1;
            }
        }
        
         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 11 || board[i][j] == -1)
                    board[i][j] = 1;
                else
                    board[i][j] = 0;
            }
         }
    }
}