package a_daily_topic;

// 最少操作使数组递增

public class No_1827 {
    public int minOperations(int[] nums) {
        int len = nums.length;
        if (len == 0 || len == 1){
            return 0;
        }
        int ans = 0;
        for (int i = 1; i < len; i++){
            int num = nums[i - 1] - nums[i];
            if (num >= 0){
                nums[i] += num + 1;
                ans += num + 1;
            }
        }
        return ans;
    }
}
