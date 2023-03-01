package algorithm;

// 剑指Offer 10 - II. 青蛙跳台阶问题

public class No_02_002 {
    public int numWays(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int a = 1, b = 2, ans = 2;
        for (int i = 3; i <= n; i++){
            ans = (a + b) % 1000000007;
            a = b;
            b = ans;
        }
        return ans;
    }
}
