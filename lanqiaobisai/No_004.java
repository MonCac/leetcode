package lanqiaobisai;

import java.util.*;

public class No_004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][m];
        for (int[] ints : a) {
            Arrays.fill(ints, 0);
        }
        for (int i = 0; i < n; i++) {
            int a1 = sc.nextInt() - 1;
            int a2 = sc.nextInt() - 1;
            int b1 = sc.nextInt() - 1;
            int b2 = sc.nextInt() - 1;
            for (int j = a1; j <= b1; j++) {
                for (int k = a2; k <= b2; k++) {
                    if (a[j][k] == 0){
                        a[j][k] = 1;
                    }else{
                        a[j][k] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
