package hot100.dynamicprogramming;

import java.util.Arrays;

public class No_416 {
    public static void main(String[] args){
        canPartition(new int[]{2,2,1,1});
    }
    public static boolean canPartition(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i : nums){
            sum += i;
        }
        if (sum % 2 != 0){
            return false;
        }
        sum /= 2;
        boolean[] bp = new boolean[sum + 1];
        bp[0] = true;
        for (int num : nums) {
            if (num > sum) {
                return false;
            }
            for (int k = sum; k >=0; k--) {
                if (bp[k]) {
                    if (k + num == sum) {
                        return true;
                    }
                    if (bp[k] && k + num <= sum) {
                        bp[k + num] = true;
                    }
                }
            }
        }
        return false;
    }
}
