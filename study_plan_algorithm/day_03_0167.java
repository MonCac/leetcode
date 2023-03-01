package study_plan_algorithm;

// 两数之和 II - 输入有序数组

public class day_03_0167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right){
            int ans = numbers[left] + numbers[right];
            if (ans == target){
                return new int[]{left + 1,right + 1};
            }
            if (ans < target){
                left++;
            }else {
                right--;
            }
        }
        return null;
    }
}
