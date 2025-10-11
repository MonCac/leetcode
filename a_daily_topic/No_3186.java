package a_daily_topic;

import java.util.Arrays;

public class No_3186 {
    public static void main(String[] args){
        maximumTotalDamage(new int[]{7,1,6,6});
    }
    public static long maximumTotalDamage(int[] power) {
        long sum = 0;
        for (int i : power){
            sum += i;
        }
        long max = 0;
        Arrays.sort(power);
        for (int i = 0; i < power.length - 1; i++) {
            long total = sum;
            int start = i, end = i;
            while(start > -1 && power[i] - power[start] < 3) {
                if (power[start] != power[i]) {
                    total -= power[start];
                }
                start--;
            }
            while (end < power.length && power[end] - power[i] < 3){
                if (power[i] != power[end]) {
                    total -= power[end];
                }
                end++;
            }
            max = Math.max(max, total);
        }
        return max;
    }
}
