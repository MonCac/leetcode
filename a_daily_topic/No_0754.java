package a_daily_topic;

// 到达终点数字

public class No_0754 {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0){
            k++;
            target -= k;
        }
        return target % 2 == 0 ? k : k + 1 + k % 2;
    }
}
