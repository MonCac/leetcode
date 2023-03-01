package algorithm;

// 剑指Offer 10 - I. 斐波那契数列

public class No_02_001 {
    public int fib(int n) {
        long a = 0, b = 1;
        long ans = 1;
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        for (int i = 2; i <= n; i++){
            ans = a + b;
            ans = ans % 1000000007;
            a = b;
            b = ans;
        }
        return (int)ans;
    }
}
