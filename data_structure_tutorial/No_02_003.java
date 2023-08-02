package data_structure_tutorial;

// 删除有序数组中的重复项 I
public class No_02_003 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int len = nums.length;
        int left = 0, right = 1;
        for (right = 1; right < len; right++){
            if (nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}
