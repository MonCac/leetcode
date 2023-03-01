package algorithm;

// 剑指 Offer 42. 连续子数组的最大和

public class No_02_004 {
    public static void main(String[] args){
        int[] nums = {1,2,-1,-2,2,1,-2,1,4,-5,4};
    }
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++){
            nums[i] += Math.max(nums[i - 1], 0);
            ans = Math.max(nums[i], ans);
        }
        return ans;
    }
}
