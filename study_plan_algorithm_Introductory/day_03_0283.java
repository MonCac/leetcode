package study_plan_algorithm_Introductory;

// 移动零

public class day_03_0283 {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1){
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for ( ; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
