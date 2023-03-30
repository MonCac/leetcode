package study_plan_algorithm_basic;

// 209. 长度最小的子数组

public class No_05_003 {
    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,1,1,1,1,1};
        minSubArrayLen(11,nums);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0, right = 0;
        while (right < nums.length){
            sum += nums[right];
            while (sum >= target && left <= right){
                ans = Math.min(ans, right - left + 1);
                sum -= nums[left];
                left ++;
            }
            right++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
