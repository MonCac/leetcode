package lanqiaobisai;

import java.util.*;

public class No_010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int m = T;
        int len = 0;
        while (T >= 1){
            len += 1;
            T /= 10;
        }
        int[] a = new int[len];
        for (int i = 0; i < len; i++){
            a[i] = m % 10;
            m /= 10;
        }
        int sum1 = 0;
        for (int i = 0; i < len; i++){
            if (a[i] == 1){
                sum1++;
            }
        }
        if (sum1 == 0){
            System.out.println(0);
            return;
        }
        if (sum1 == 1 || sum1 == 2){
            System.out.println(1);
            return;
        }
        // 找到数组a中的包含最多1的对称子数组
        int max1 = 0;
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len - i; j++){
                int[] b = Arrays.copyOfRange(a,j,j + i + 1);
                max1 = Math.max(isReverse(b),max1);
            }
        }
        int ans = sum1 - max1;
        ans += max1 % 2;
        ans += max1 / 2;
        System.out.println(ans);
    }
    public static int isReverse(int[] b){
        int len = b.length;
        int[] a = new int[len];
        int sum1 = 0;
        for (int i = 0; i < len; i++){
            a[i] = b[len - 1 - i];
            if (a[i] == 1){
                sum1++;
            }
        }
        boolean isequal = true;
        for (int i = 0; i < len; i++){
            if (a[i] != b[i]){
                isequal = false;
            }
        }
        if (isequal){
            return sum1;
        }else{
            return -1;
        }
    }
}
