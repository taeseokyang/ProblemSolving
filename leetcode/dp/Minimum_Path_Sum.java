class Solution {
    public int minPathSum(int[][] grid) {
        int h = grid.length;
        int w = grid[0].length;
        for(int i = 0 ; i<h ; i++ )
            for(int j = 0 ; j<w ; j++ )
                if(i == 0 && j != 0) grid[i][j] += grid[i][j-1];
                else if(j == 0 && i != 0) grid[i][j] += grid[i-1][j];
                else if(i != 0 && j != 0) grid[i][j] += Math.min(grid[i][j-1],grid[i-1][j]);
        return grid[h-1][w-1];
    }
}