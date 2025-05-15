package programmercarl.greedy;

//  122. 买卖股票的最佳时机 II

public class No122 {
    public int maxProfit(int[] prices) {
        int ans = 0;
        if (prices.length < 2){
            return ans;
        }
        for (int i = 0; i < prices.length - 1; i++){
            int add = prices[i + 1] - prices[i];
            if (add > 0){
                ans += add;
            }
        }
        return ans;
    }
}
