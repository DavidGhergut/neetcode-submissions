class Solution {
    int[][] dirs = {
        {-1, 0}, // up
        {1, 0}, // down
        {0, 1}, // right
        {0, -1} // left
    };

    int count;

    public int maxAreaOfIsland(int[][] grid) {
        int N = grid.length;
        int M = grid[0].length;
        
        int maxArea = 0;
        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 1) {
                    count = 0;
                    dfs(grid, i, j);
                    if (count > maxArea)
                        maxArea = count;
                }
            }
        }

        return maxArea;
    }

    public void dfs(int[][] grid, int i, int j) {
        int N = grid.length;
        int M = grid[0].length;

        if (i < 0 || i >= N || j < 0 || j >= M || grid[i][j] == 0)
            return;
        
        grid[i][j] = 0;
        count++;
        for (int[] dir : dirs) {
            int neighborX = i + dir[0];
            int neighborY = j + dir[1];
            dfs(grid, neighborX, neighborY);
        }
    }
}
