package a_daily_topic;

// 递减元素使数组成锯齿状

public class No_1144 {
    public static void main(String[] args){
        int[] nums = new int[]{2,7,10,9,8,9};
        movesToMakeZigzag(nums);
    }
    public static int movesToMakeZigzag(int[] nums) {
        int ans1 = 0, ans2 = 0;
        // ans1计算奇数的，ans2计算偶数的
        int len = nums.length;
        if (len <= 2){
            return 0;
        }
        if (len % 2 == 0){
            ans1 = nums[0] < nums[1] ? nums[1] - nums[0] + 1 : 0;
            for (int i = 2; i < len; i += 2){
                int index = Math.max(nums[i - 1], nums[i + 1]);
                ans1 += nums[i] < index ? index - nums[i] + 1 : 0;
            }
            for (int i = 1; i < len - 1; i += 2){
                int index = Math.max(nums[i - 1], nums[i + 1]);
                ans2 += nums[i] < index ? index - nums[i] + 1 : 0;
            }
            ans2 += nums[len - 1] < nums[len - 2] ? nums[len - 2] - nums[len - 1] + 1 : 0;
        }else {
            ans1 = nums[0] < nums[1] ? nums[1] - nums[0] + 1 : 0;
            ans1 += nums[len - 1] < nums[len - 2]? nums[len - 2] - nums[len - 1] + 1 : 0;
            for (int i = 2; i < len - 1; i += 2){
                int index = Math.max(nums[i - 1], nums[i + 1]);
                ans1 += nums[i] < index ? index - nums[i] + 1 : 0;
            }
            for (int i = 1; i < len; i += 2){
                int index = Math.max(nums[i - 1], nums[i + 1]);
                ans2 += nums[i] < index ? index - nums[i] + 1 : 0;
            }
        }
        return Math.min(ans1,ans2);
    }
}
