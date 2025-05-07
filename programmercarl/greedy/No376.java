package programmercarl.greedy;

// 376. 摆动序列

public class No376 {
    public static void main(String[] args){
        wiggleMaxLength(new int[]{3,3,3,2,5,5,5,7});
    }
    public static int wiggleMaxLength(int[] nums) {
        int ans = 1;
        if (nums.length == 1){
            return ans;
        }
        int before = 0, after = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            after = nums[i] - nums[i + 1];
            if (before == 0) {
                if (after != 0){
                    ans++;
                    before = after;

                }
            }else{
                if (before * after < 0) {
                    ans++;
                    before = after;
                }
            }
        }
        return ans;
    }
}
