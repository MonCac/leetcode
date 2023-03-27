package study_plan_algorithm_basic;

// 153. 寻找旋转排序数组中的最小值

public class No_02_001 {
    public static void main(String[] args){
        int[] nums = new int[]{3,1,2};
        findMin(nums);
    }
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}
