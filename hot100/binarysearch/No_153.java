package hot100.binarysearch;

public class No_153 {
    public int findMin(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int left = 0, right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }
            if (nums[mid] >= nums[right]){
                left = mid + 1;
                continue;
            }
            if (nums[mid] <= nums[right]){
                if (mid > 0 && nums[mid - 1] > nums[mid]){
                    return nums[mid];
                }
                right = mid - 1;
            }
        }
        return nums[left];
    }
}
