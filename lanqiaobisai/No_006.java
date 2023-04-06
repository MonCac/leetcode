package lanqiaobisai;

import java.util.*;

public class No_006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[n];
        int sum = 0;
        int ans = 1;
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            sum += sumLong(A[i]);
        }
        long i = 1;
        while (ans < sum){
            ans *= i;
            i++;
        }
        i--;
        ans /= i;
        System.out.println(ans);
    }
    public static long sumLong(long num){
        long ans = 1;
        for (int i = 1; i <= num; i++){
            ans *= i;
        }
        return ans;
    }
}
