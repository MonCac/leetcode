package algorithm;

// 剑指Offer 63. 股票的最大利润

public class No_02_010 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
                max = prices[i];
            }
            if (max < prices[i]) {
                max = prices[i];
                ans = Math.max(ans, max - min);
            }
        }
        return ans;
    }
}
