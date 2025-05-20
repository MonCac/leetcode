package programmercarl.greedy;

// 1005. K次取反后最大化的数组和

import java.util.Arrays;

public class No1005 {
    public static void main(String[] args){
        largestSumAfterKNegations(new int[]{-3,-2,-4}, 4);
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 ){
                if (k > 0) {
                    ans += -nums[i];
                    k--;
                }else{
                    ans += nums[i];
                }
            }else{
                if (k > 0){
                    if (k % 2 == 0){
                        ans += nums[i];
                    }else{
                        if (nums[0] >= 0 || -nums[i - 1] > nums[i]) {
                            ans += -nums[i];
                        } else {
                            ans += nums[i - 1] * 2;
                            ans += nums[i];
                        }
                    }
                    k = 0;
                }else{
                    ans += nums[i];
                }
            }
        }
        if (k > 0){
            if (k % 2 == 1){
                ans += nums[nums.length - 1] * 2;
            }
        }
        return ans;
    }
}
