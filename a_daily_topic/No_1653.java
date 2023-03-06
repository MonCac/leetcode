package a_daily_topic;

// 使字符串平衡的最少删除次数

public class No_1653 {
    public static void main(String[] args){
        minimumDeletions("bbbbb");
    }
    public static int minimumDeletions(String s) {
        int len = s.length();
        if (len == 1){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int[] cost = new int[len];
        int num = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'b'){
                num++;
            }
            cost[i] = num;
        }
        num = 0;
        for (int i = len - 1; i > 0; i--) {
            cost[i] = num;
            if (s.charAt(i) == 'a'){
                num++;
            }
            ans = Math.min(ans,cost[i] + cost[i - 1]);
            cost[i] = num;
        }
        if (s.charAt(0) == 'b'){
            cost[0] = cost[1];
            ans = Math.min(ans,cost[0]);
        }
        return ans;
    }
}
