package a_daily_topic;

// 袋子里最少数目的球

import java.util.Arrays;

public class No_1760 {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        int ans = 0;
        while (left <= right){
            int y = (left + right) / 2;
            long ops = 0;
            for (int x : nums){
                ops += (x - 1) / y;
            }
            if (ops <= maxOperations){
                ans = y;
                right = y - 1;
            }else{
                left = y + 1;
            }
        }
        return ans;
    }
}
