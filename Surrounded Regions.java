public class Solution {
    public void solve(char[][] board) {
        if (board.length <= 2)
            return;
        
        if (board[0].length <= 2)
            return;
        
        int rows = board.length;
        int cols = board[0].length;
        Queue<Point> queue = new LinkedList<>();
        

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') {
                queue.add(new Point(0, j));
            }
            if (board[rows - 1][j] == 'O') {
                queue.add(new Point(rows - 1, j));
            }
        }
        
        for (int i = 1; i < rows - 1; i++) {
            if (board[i][0] == 'O') {
                queue.add(new Point(i, 0));
            }
            if (board[i][cols -1] == 'O') {
                queue.add(new Point(i, cols - 1));
            }
        }
        
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            board[p.x][p.y] = '+';
            if (p.x - 1 >= 0 && board[p.x-1][p.y] == 'O') 
                queue.add(new Point(p.x - 1, p.y));
            if (p.x + 1 < rows && board[p.x + 1][p.y] == 'O') 
                queue.add(new Point(p.x + 1, p.y));
            if (p.y - 1>= 0 && board[p.x][p.y - 1] == 'O') 
                queue.add(new Point(p.x, p.y - 1));
            if (p.y + 1 < cols && board[p.x][p.y + 1] == 'O') 
                queue.add(new Point(p.x, p.y + 1));
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                if (board[i][j] == '+')
                    board[i][j] = 'O';
                
            }
        }

    }
}

class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}