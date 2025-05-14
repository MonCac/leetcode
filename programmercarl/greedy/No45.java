package programmercarl.greedy;

// 跳跃游戏 II

public class No45 {
    public int jump(int[] nums) {
        if (nums.length < 2){
            return 0;
        }
        int end = 0;
        int sum = 0;
        int mix = 0;
        for (int i = 0; i < nums.length; i++){
            int start = nums[i] + i;
            if (start > end){
                sum++;
                end = start;
            }
            if (end >= nums.length - 1){
                break;
            }
        }
        return sum;
    }
}
