package programmercarl.greedy;

// 45. 跳跃游戏 II

public class No45 {
    public static void main(String[] args){
        jump(new int[]{2,3,1,1,4});
    }
    public static int jump(int[] nums) {
        if (nums.length < 2){
            return 0;
        }
        int end = 0;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (max < i + nums[i]) {
                max = i + nums[i];
                if (max >= nums.length - 1){
                    return ++sum;
                }
            }
            if (end <= i){
                end = max;
                sum++;
            }
            if (end >= nums.length - 1){
                break;
            }
        }
        return sum;
    }
}
