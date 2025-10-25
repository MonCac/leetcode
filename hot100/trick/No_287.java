package hot100.trick;

public class No_287 {
    public int findDuplicate(int[] nums) {
        if (nums[0] == nums[nums.length - 1]) {
            return nums[0];
        }
        int sum = nums.length * (nums.length - 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return Math.abs(sum);
    }
}
