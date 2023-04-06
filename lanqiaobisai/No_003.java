package lanqiaobisai;

import java.util.*;
public class No_003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int n = sc.nextInt();
        int m = n / 10;
        int[][] a = new int[n][2];
        // 存放每个数字一共多少个值
        int[] c = new int[10];
        for (int i = 0; i < n; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            c[a[i][0]]++;
        }
        // 得到每个值还差多少才够
        for (int i = 0; i < 10; i++){
            c[i] -= m;
        }
        // 根据b数组对a数组进行排序

        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){

            }
        }
        for(int i = 0; i < n; i++){
            if (c[a[i][0]] > 0){
                c[a[i][0]]--;
                ans += a[i][1];
            }
        }
        System.out.println(ans);
    }
}
