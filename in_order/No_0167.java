package in_order;

// 两数之和II - 输入有序数组

public class No_0167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target)
                return new int[]{left + 1, right + 1};
            if(sum < target)
                left++;
            if (sum > target)
                right--;
        }
        return new int[]{-1,-1};
    }
}
