package hot100.greed;

public class No_45 {
    public static void main(String[] args){
        jump(new int[]{2,3,1,1,4});
    }
    public static int jump(int[] nums) {
        int ans = 0;
        int total = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            if (sum < i){
                sum = total;
                ans++;
                if (sum >= nums.length){
                    return ans;
                }
            }
            total = Math.max(total, nums[i] + i);
        }
        return ans;
    }
}
