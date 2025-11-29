package hot100.greed;

public class No_55 {
    public boolean canJump(int[] nums) {
        int step = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (i > step){
                return false;
            }
            step = Math.max(step, (i + nums[i]));
            if (step >= nums.length){
                return true;
            }
        }
        return true;
    }
}
