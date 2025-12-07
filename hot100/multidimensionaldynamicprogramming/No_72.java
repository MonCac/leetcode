package hot100.multidimensionaldynamicprogramming;

public class No_72 {
    public static void main(String[] args){
        minDistance("intention", "execution");
    }
    public static int minDistance(String word1, String word2) {
        if (word1.isEmpty() || word2.isEmpty()){
            return Math.max(word1.length(), word2.length());
        }
        int[][] dp = new int[word1.length()][word2.length()];
        for (int i = 0; i < word1.length(); i++){
            for (int j = 0; j < word2.length(); j++){
                boolean b = word1.charAt(i) != word2.charAt(j);
                if (i == 0){
                    if (j == 0){
                        if (b) {
                            dp[i][j] = 1;
                        }
                    }else{
                        if (b) {
                            dp[i][j] = dp[i][j-1] + 1;
                        }else{
                            dp[i][j] = Math.max(dp[i][j-1], j);
                        }
                    }
                    continue;
                }
                if (j == 0){
                    if (b){
                        dp[i][j] = dp[i-1][j] + 1;
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j], i);
                    }
                    continue;
                }
                if (b){
                    dp[i][j] = Math.min(Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1])) + 1, Math.max(i,j) + 1);
                }else{
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[word1.length()-1][word2.length()-1];
    }

}
