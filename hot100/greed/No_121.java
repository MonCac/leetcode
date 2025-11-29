package hot100.greed;

public class No_121 {
    public static void main(String[] args){
        maxProfit(new int[]{7,1,5,3,6,4});
    }
    public static int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            int now = prices[i];
            if (now < min){
                min = now;
            }else{
                ans = Math.max((prices[i] - min), ans);
            }
        }
        return ans;
    }
}
