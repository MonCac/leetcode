package hot100.dynamicprogramming;

public class No_198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1){
            return nums[0];
        }
        if (len == 2){
            return Math.max(nums[0], nums[1]);
        }
        nums[2] = nums[0] + nums[2];
        if (len == 3){
            return Math.max(nums[1], nums[0] + nums[2]);
        }
        for (int i = 3; i < len; i++){
            nums[i] = nums[i] + Math.max(nums[i-2], nums[i-3]);
        }
        return Math.max(nums[len-1], nums[len-2]);
    }
}
