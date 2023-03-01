package algorithm;

// 剑指 Offer 60. n个骰子的点数

import java.util.Arrays;

public class No_02_009 {
    public static void main(String[] args){
        int n = 3;
        dicesProbability(n);
    }
    public static double[] dicesProbability(int n) {
        double[] temp1 = new double[6 * n + 1];
        double[] temp2 = new double[6 * n + 1];
        int flag = -1;
        for (int i = 1; i <= 6; i++) {
            temp1[i] = 1.0 / 6.0;
        }
        if (n == 1) {
            return Arrays.copyOfRange(temp1,1,7);
        }
        for (int i = 2; i <= n; i++){
            for (int j = i - 1; j <= 6 * (i - 1); j++){
                for (int k = 1; k <= 6; k++){
                    if (flag == -1) {
                        temp2 = new double[6 * n + 1];
                        temp2[k + j] += (1.0 / 6.0) * temp1[j];
                    }else{
                        temp1 = new double[6 * n + 1];
                        temp1[k + j] += (1.0 / 6.0) * temp2[j];
                    }
                }
            }
            flag *= -1;
        }
        return flag == -1? Arrays.copyOfRange(temp1,n,6 * n + 1) : Arrays.copyOfRange(temp2,n,6 * n + 1);
    }
}
