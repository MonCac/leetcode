package programmercarl.greedy;

// 53. 最大子数组和

public class No53 {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int i : nums){
            sum += i;
            if (sum > ans){
                ans = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}
