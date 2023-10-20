class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int dp[][] = new int[n+1][m+1];
        dp[0][1] = 1;
        for (int i=0;i<puddles.length;i++)
            dp[puddles[i][1]][puddles[i][0]] = -1;
        for (int i=1;i<=n;i++)
            for (int j=1;j<=m;j++){
                int left = dp[i][j-1];
                int up = dp[i-1][j];
                if (left == -1) left = 0;
                if (up == -1) up = 0;
                if (dp[i][j] != -1) dp[i][j] = (left+up)%1000000007;
            }
        return dp[n][m];
    }
}