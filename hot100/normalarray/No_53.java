package hot100.normalarray;

public class No_53 {
    public int maxSubArray(int[] nums) {
        int min = 0;
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums){
            sum += num;
            ans = Math.max(ans, sum - min);
            min = Math.min(min, sum);
        }
        return ans;
    }
}
