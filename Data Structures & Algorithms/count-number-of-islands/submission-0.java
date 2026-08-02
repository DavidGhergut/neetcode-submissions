class Solution {

    int[][] dirs = {
        {1, 0}, // down
        {-1, 0}, // up
        {0, 1}, // right
        {0, -1} // left
    };

    public int numIslands(char[][] grid) {
        int N = grid.length;
        int M = grid[0].length;

        int islands = 0;
        
        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }
        
        return islands;
    }

    public void dfs(char[][] grid, int i, int j) {
        int N = grid.length;
        int M = grid[0].length;
        
        if (i < 0 || i >= N || j < 0 || j >= M || grid[i][j] == '0')
            return;
        
        grid[i][j] = '0';

        for (int k = 0; k < 4; k ++) {
            int neighborX = i + dirs[k][0];
            int neighborY = j + dirs[k][1];
            dfs(grid, neighborX, neighborY);
        }
    }


}
