package programmercarl.array;

// 209.长度最小的子数组

public class No209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = 0, res = nums.length;
         for (int i = 0; i < nums.length; i++) {
             sum += nums[i];
         }
         if (sum < target){
             return 0;
         }
         sum = 0;
         while (left <= nums.length) {
             if (sum < target){
                 if (left == nums.length){
                     return res;
                 }
                 sum += nums[left];
                 left++;
             }else{
                 res = Math.min(res, left - right);
                 sum -= nums[right];
                 right++;
             }
         }
         return res;
    }
}
