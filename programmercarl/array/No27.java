package programmercarl.array;

// 27.移除元素

public class No27 {
    public int removeElement(int[] nums, int val) {
        int right = 0;
        for (int left = 0; left < nums.length; left++) {
            if (nums[left] != val) {
                nums[right] = nums[left];
                right++;
            }
        }
        return right;
    }
}
