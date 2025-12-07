package hot100.multidimensionaldynamicprogramming;

public class No_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1][len2];
        for (int i = 0; i < len1; i++){
            for (int j = 0; j < len2; j++){
                boolean b = (text1.charAt(i) == text2.charAt(j));
                if (i == 0 && j == 0){
                    if (b){
                        dp[i][j] = 1;
                    }
                    continue;
                }
                if (i == 0){
                    if (b){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = dp[i][j-1];
                    }
                    continue;
                }
                if (j == 0){
                    if (b){

                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                    continue;
                }
                if (b){
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[len1-1][len2-1];
    }
}
