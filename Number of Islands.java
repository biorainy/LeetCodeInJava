public class Solution {
    public int numIslands(char[][] grid) {
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    counter++;
                }
            }
        }
        return counter;
    } 
    
    public void dfs(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length)
            return;
        if (grid[row][col] != '1')
            return;
            
        if (grid[row][col] == '1')
            grid[row][col] = 'v';
        
        dfs(grid, row + 1, col);
        dfs(grid, row -1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}

