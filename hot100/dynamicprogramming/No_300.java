package hot100.dynamicprogramming;

import java.util.Arrays;
import java.util.Map;

public class No_300 {
    public static void main(String[] args){
        lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
    }
    public static int lengthOfLIS(int[] nums) {
        int[] sum = new int[nums.length];
        Arrays.fill(sum, 1);
        int ans = 1;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < i; j++){
               if (nums[j] < nums[i]){
                   sum[i] = Math.max(sum[i], sum[j] + 1);
               }
            }
            ans = Math.max(ans, sum[i]);
        }
        return ans;
    }
}
