package programmercarl.greedy;

// 跳跃游戏

public class No55 {
    public boolean canJump(int[] nums) {
        if (nums.length < 2){
            return true;
        }
        int sum = 1;
        for (int i = nums.length - 2; i> 0; i--){
            if (nums[i] >= sum){
                sum = 1;
            }else{
                sum++;
            }
        }
        return nums[0] >= sum;
    }
}
