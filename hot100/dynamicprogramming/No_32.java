package hot100.dynamicprogramming;

public class No_32 {
    public static void main(String[] args){
        longestValidParentheses("(()())");
    }
    public static int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        int ans = 0;
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == ')'){
                if (i >= 1 && (i - dp[i - 1] - 1 >= 0) && chars[i - dp[i - 1] - 1] =='('){
                    if (i - dp[i - 1] - 2 >= 0) {
                        dp[i] = 2 + dp[i - dp[i - 1] - 2] + dp[i - 1];
                    }else{
                        dp[i] = 2 + dp[i - 1];
                    }
                }
                ans = Math.max(dp[i], ans);
            }
        }
        return ans;
    }
}
