public class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (word.length()== 1)
                        return true;
                    board[i][j] = '.';
                    if (exist(board, word.substring(1), i, j))
                        return true;
                    else
                        board[i][j] = word.charAt(0);
                }
            }
        }
        return false;
    }
    
    public boolean exist(char[][] board, String word, int row, int col) {
        if (row + 1 < board.length && board[row+1][col] == word.charAt(0)) {
            if (word.length()== 1)
                return true;
            board[row+1][col] = '.';
            if (exist(board, word.substring(1), row+1, col))
                return true;
            else
                board[row+1][col]  = word.charAt(0);
        }
        if (row - 1 >= 0 && board[row-1][col] == word.charAt(0)){
            if (word.length()== 1)
                return true;
            board[row-1][col] = '.';
            
            if (exist(board, word.substring(1), row-1, col))
                return true;
            else
                board[row-1][col]  = word.charAt(0);
        }
        if (col + 1 < board[0].length && board[row][col+1] == word.charAt(0)){
            if (word.length()== 1)
                return true;
            board[row][col+1] = '.';
           
            if (exist(board, word.substring(1), row, col+1))
                return true;
            else
                board[row][col+1]  = word.charAt(0);
        }
        if (col -1 >= 0 && board[row][col-1] == word.charAt(0)){
            if (word.length()== 1)
                return true;
            board[row][col-1] = '.';
             if (exist(board, word.substring(1), row, col-1))
                return true;
            else
                board[row][col-1]  = word.charAt(0);
        }
        
        return false;
    }
}