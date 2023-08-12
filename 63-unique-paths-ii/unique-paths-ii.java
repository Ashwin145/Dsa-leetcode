 class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       int m = obstacleGrid.length, n = obstacleGrid[0].length;
       if (obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1)
            return 0;
       int[][] dp = new int[m][n];
       for (int col = 0; col < n; col++)
            if (obstacleGrid[0][col]==0)
                dp[0][col]=1;
            else
                break;
        for(int row = 0; row<m; row++)
            if (obstacleGrid[row][0] ==0)
                dp[row][0]=1;
            else
                break;
        for(int i=1; i< m; i++){
            for(int j = 1; j <n; j++){
                dp[i][j] =(obstacleGrid[i][j]==1)?0:dp[i-1][j]+dp[i][j-1];
            }
        }  
        return dp[m-1][n-1];
    }
}