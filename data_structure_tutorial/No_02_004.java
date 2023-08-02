package data_structure_tutorial;

// 删除有序数组中的重复项 II

public class No_02_004 {
    public static void main(String[] args){
        removeDuplicates(new int[]{1,1,1,2,2,3});
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        if (nums.length == 2){
            return 2;
        }
        int len = nums.length;
        int left = 1, right;
        for (right = 2; right < len; right++){
            if (nums[left] != nums[right] || nums[left - 1] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}
