package hot100.normalarray;

public class No_238 {
    public static void main(String[] args){
        productExceptSelf(new int[]{1,2,3,4});
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i - 1] * res[i - 1];
        }
        int sumRight = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            sumRight *= nums[i + 1];
            res[i] *= sumRight;
        }
        return res;
    }
}
