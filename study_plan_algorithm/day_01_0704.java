package study_plan_algorithm;

// 二分查找

public class day_01_0704 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = -1;
        while (left <= right){
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
