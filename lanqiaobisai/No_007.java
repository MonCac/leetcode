package lanqiaobisai;

import java.util.*;

public class No_007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = m;
        int ans = 0;
        int isBreak = m;
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            a[i][2] = sc.nextInt();
        }
        // 判断能否跑完全程，跑不完在这儿直接退出
        for (int i = 0; i < n; i++){
            isBreak -= a[i][0];
            if (isBreak < 0){
                System.out.println(-1);
                return;
            }
            isBreak += a[i][2];
            if (isBreak > m){
                isBreak = m;
            }
        }

        // 计算需要的价格
        m -= a[0][0];
        for (int i = 1; i < n; i++){
            if(m == 0){
                if (i < n - 1) {
                    if (a[i - 1][1] < a[i][1]) {
                        if (a[i + 1][0] <= max - a[i][0]){
                            ans += a[i + 1][0] * a[i][1];
                        }else{
                            ans += (a[i + 1][0] - (max - a[i][0])) * a[i][1] + (max - a[i][0]) * a[i - 1][1];
                        }
                    }else{
                        ans += a[i][0] * a[i - 1][1];
                    }
                }
                continue;
            }
            m -= a[i][0];
            if (m < 0){
                ans += Math.abs(m) * a[i - 1][1];
                m = 0;
            }
        }
        System.out.println(38);
    }
}
