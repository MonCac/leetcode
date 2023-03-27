package study_plan_algorithm_basic;

// 162. 寻找峰值

public class No_02_002 {
    public static void main(String[] args){
        int[] nums = new int[]{1,2};
        findPeakElement(nums);
    }
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return 0;
        }
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
