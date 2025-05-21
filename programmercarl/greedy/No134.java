package programmercarl.greedy;

// 134. 加油站

import java.util.Arrays;

public class No134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans = 0;
        int len = gas.length;
        int[] diff = new int[len];
        for (int i = 0; i < len; i++){
            diff[i] = gas[i] - cost[i];
        }
        if (Arrays.stream(diff).sum() < 0){
            return -1;
        }else{
            int sum = 0;
            for (int i = 0; i < len; i++){
                sum += diff[i];
                if (sum < 0){
                    ans = i + 1;
                    sum = 0;
                }
            }
        }
        return ans;
    }
}
