package a_daily_topic;

// 使每位学生都有座位的最少移动次数

import java.util.Arrays;

public class No_2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n = seats.length;
        int ans = 0;
        for (int i = 0; i < n; i++){
            int sum = Math.abs(seats[i] - students[i]);
            ans += sum;
        }
        return ans;
    }
}
