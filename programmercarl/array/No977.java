package programmercarl.array;

// 977.有序数组的平方

public class No977 {
    public static void main(String[] args) {
        int[] nums = new int[]{-5,-3,-2,-1};
        sortedSquares(nums);
    }
    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        if (len == 1){
            return new int[]{nums[0] * nums[0]};
        }
        int[] res = new int[len];
        int left = 0, right = 0;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] * nums[i + 1] <= 0){
                left = i;
                right = i + 1;
            }
        }
        if (left != right){
            for (int i = 0; i < len; i++) {
                if (left >= 0 && right < len){
                    int a = nums[left] * nums[left];
                    int b = nums[right] * nums[right];
                    if (a > b){
                        res[i] = b;
                        right++;
                    }else {
                        res[i] = a;
                        left--;
                    }
                } else if (left < 0) {
                    res[i] = nums[right] * nums[right];
                    right++;
                }else{
                    res[i] = nums[left] * nums[left];
                    left--;
                }
            }
        }else{
            if (nums[0] >= 0){
                for (int i = 0; i < len; i++) {
                    res[i] = nums[i] * nums[i];
                }
            }else{
                for (int i = len - 1; i >= 0; i--) {
                    res[len - i - 1] = nums[i] * nums[i];
                }
            }
        }
        return res;
    }

    public int[] sortedSquares1(int[] nums) {
        int len = nums.length;
        if (len == 1){
            return new int[]{nums[0] * nums[0]};
        }
        int[] res = new int[len];
        int left = 0, right = len - 1;
        for (int i = len - 1; i >= 0; i--) {
            int a = nums[left] * nums[left];
            int b = nums[right] * nums[right];
            if (a > b) {
                res[i] = a;
                right--;
            }else{
                res[i] = b;
                left++;
            }
        }
        return res;
    }
}
