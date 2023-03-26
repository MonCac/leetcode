package study_plan_algorithm_basic;

// 34. 在排序数组中查找元素的第一个和最后一个位置

public class No_001_01 {
    public int[] searchRange(int[] nums, int target) {
        int start = binarySearch(nums,target);
        if (start == nums.length || nums[start] != target){
            return new int[]{-1,-1};
        }else{
            int end = binarySearch(nums,target + 1);
            return new int[]{start,end - 1};
        }
    }

    public int binarySearch(int[] nums, int target){
        // 闭区间，[0,left] < target,[left+1,right] >= target
        int left = 0,right = nums.length - 1;
        while (left <= right){
            // 防止 int 越界
            int mid = left + (right - left) / 2;
            if (nums[mid] < target){
                // 说明[left, mid] < target, 接着判断[mid + 1, right]
                left = mid + 1;
            }else{
                // 说明[mid, right] < target, 接着判断[left, mid - 1]
                right = mid - 1;
            }
        }
        return left;
    }
}
