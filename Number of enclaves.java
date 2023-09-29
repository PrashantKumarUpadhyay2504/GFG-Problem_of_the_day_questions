class Solution {
    void dfs(int i, int j, int[][] grid) {
        if(i<0 || i == grid.length || j<0 || j == grid[0].length || grid[i][j] == 0)
         return;
        grid[i][j] = 0;
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i+1,j,grid);
        dfs(i,j-1,grid);
    }

    int numberOfEnclaves(int[][] grid) {
        int m = grid.length-1, n = grid[0].length-1, ans = 0;
        for(int i=0; i<=m; i++) {
            if(grid[i][0] == 1) dfs(i,0,grid);
            if(grid[i][n] == 1) dfs(i,n,grid);
        }
        for(int j=0; j<=n; j++) {
            if(grid[0][j] == 1) dfs(0,j,grid);
            if(grid[m][j] == 1) dfs(m,j,grid);
        }
        
        for(int[] row: grid) {
            for(int val : row) {
                ans += val;
            }
        }
    return ans;
        // Your code here
    }
}
