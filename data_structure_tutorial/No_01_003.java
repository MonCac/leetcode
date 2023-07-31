package data_structure_tutorial;

// 两数之和

import java.util.Arrays;

public class No_01_003 {
    public static void main(String[] args){
        int[] a = new int[]{-1,-2,-3,-4,-5};
        twoSum(a,-8);
    }
    public static int[] twoSum(int[] nums, int target) {
        Integer[] num = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++){
            num[i] = i;
        }
        //注意此时num必须是Integer类型，因为Arrays.sort中使用的是泛型

        Arrays.sort(num, (i, j)-> nums[i] - nums[j]);
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int goal = nums[left] + nums[right];
        while (goal != target) {
            if (goal > target){
                right--;
            }else{
                left++;
            }
            goal = nums[left] + nums[right];
        }
        return new int[]{num[left],num[right]};
    }
}
