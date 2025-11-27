package hot100.binarysearch;

public class No_33 {
    public static void main(String[] args) {
        search(new int[]{5,1,3}, 3);
    }
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > nums[right]){
                if (target > nums[right]){
                    if (nums[mid] > target){
                        right = mid - 1;
                    }else{
                        left = mid + 1;
                    }
                }else{
                    left = mid + 1;
                }
            }else{
                if (target > nums[right]){
                    right = mid - 1;
                }else{
                    if (nums[mid] > target){
                        right = mid - 1;
                    }else{
                        left = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
