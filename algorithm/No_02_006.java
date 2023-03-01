package algorithm;

// 剑指 Offer47. 礼物的最大价值

public class No_02_006 {
    public int maxValue(int[][] grid) {
        int len1 = grid.length;
        int len2 = grid[0].length;
        int[][] dp = new int[len1][len2];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < len2; i++){
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
        for (int i = 1; i < len1; i++) {
            for (int j = 0; j < len2; j++){
                if (j == 0) {
                    dp[i][j] = grid[i][j] + dp[i - 1][j];
                }
                else {
                    dp[i][j] = grid[i][j] + Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[len1 - 1][len2 - 1];
    }
}
