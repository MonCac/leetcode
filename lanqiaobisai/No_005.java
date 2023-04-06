package lanqiaobisai;

import java.util.*;

public class No_005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long ans = 0;
        long x = (long)Math.pow((double)a,(double)b);
        if (x < 1){
            System.out.println(0);
        }
        for (long i = 1; i < x; i++){
            if (GCD(i,x)){
                ans++;
                ans %= 998244353;
            }
        }
        System.out.println(ans);
    }
    public static boolean GCD(long a, long b)
    {
        if(a==1||b==1)
            // 两个正整数中，只有其中一个数值为1，两个正整数为互质数
        {
            return true;
        }
        while(true)
        {          // 求出两个正整数的最大公约数
            long t = a % b;
            if(t == 0)
            {
                break;
            }
            else
            {
                a = b;
                b = t;
            }
        }
        if(b>1) {
            return false;
            // 如果最大公约数大于1，表示两个正整数不互质
        } else {
            return true;
            // 如果最大公约数等于1,表示两个正整数互质
        }
    }
}
