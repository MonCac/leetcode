package hot100.trick;

public class No_287 {
    public static void main(String[] args){
        findDuplicate(new int[]{1,3,4,2,2});
    }
    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] != i + 1)
                return nums[i];
        }
        return -1;
    }
}
