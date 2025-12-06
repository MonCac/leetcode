package hot100.dynamicprogramming;

public class No_152 {
    public int maxProduct(int[] nums) {
        long[] posNum = new long[nums.length];
        long[] negNum = new long[nums.length];
        long ans = nums[0];
        for(int i = 0; i < nums.length; i++){
            if (i == 0){
                if (nums[i] >= 0){
                    posNum[i] = nums[i];
                }else{
                    negNum[i] = nums[i];
                }
            }else{
                if (nums[i] == 0){
                    posNum[i] = 0;
                    negNum[i] = 0;
                } else if (nums[i] > 0) {
                    if (nums[i - 1] == 0){
                        posNum[i] = nums[i];
                        negNum[i] = 0;
                    }else{
                        posNum[i] = posNum[i-1] == 0 ? nums[i] : nums[i] * posNum[i-1];
                        negNum[i] = negNum[i-1] == 0 ? 0 : nums[i] * negNum[i-1];
                    }
                }else{
                    if (nums[i - 1] == 0){
                        posNum[i] = 0;
                        negNum[i] = nums[i];
                    }else{
                        posNum[i] = negNum[i-1] == 0 ? 0 : nums[i] * negNum[i-1];
                        negNum[i] = posNum[i-1] == 0 ? nums[i] : nums[i] * posNum[i-1];
                    }
                }
                ans = Math.max(ans, posNum[i]);
            }
        }
        return (int)ans;
    }
}
