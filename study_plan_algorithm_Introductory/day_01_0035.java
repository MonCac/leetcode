package study_plan_algorithm_Introductory;

// 搜索插入位置

public class day_01_0035 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        if (nums[right] < target){
            return nums.length;
        }
        while (left < right){
            int mid = (left + right) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}
