package study_plan_algorithm_basic;

// 713. 乘积小于K的子数组

public class No_05_002 {
    public static void main(String[] args){
        int[] nums = new int[]{1,1,1};
        int k = 1;
        numSubarrayProductLessThanK2(nums,k);

    }
    // 普通解法
    public int numSubarrayProductLessThanK1(int[] nums, int k) {
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int mult = 1;
            for (int j = i; j < len; j++) {
                mult = mult * nums[j];
                if (mult < k){
                    ans++;
                }else{
                    break;
                }
            }
        }
        return ans;
    }

    //滑动窗口解法
    public static int numSubarrayProductLessThanK2(int[] nums, int k) {
        int ans = 0;
        int mult = 1;
        int left = 0, right = 0;
        if (k < 1){
            return ans;
        }
        while (right < nums.length) {
            mult *= nums[right];
            while (mult >= k && left <= right){
                mult /= nums[left];
                left++;
            }
            ans += right - left + 1;
            right++;
        }
        return ans;
    }
}
