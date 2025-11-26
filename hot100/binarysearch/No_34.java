package hot100.binarysearch;

public class No_34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        if (left >= nums.length || nums[left] != target){
            return new int[]{-1, -1};
        }else{
            int left1 = left;
            right = nums.length - 1;
            while (left1 <= right) {
                int mid = left1 + (right - left1) / 2;
                if(nums[mid] > target){
                    right = mid - 1;
                }else{
                    left1 = mid + 1;
                }
            }
            return new int[]{left, right};
        }
    }
}
