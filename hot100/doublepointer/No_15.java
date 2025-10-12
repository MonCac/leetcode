package hot100.doublepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_15 {
    public static void main(String[] args){
        int[] nums = new int[]{0,0,0,0};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (len < 3){
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++){
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int left = i + 1, right = len - 1;
            while (left < right){
                int sum = nums[left] + nums[right];
                if (sum < -nums[i]){
                    left++;
                } else if (sum > -nums[i]) {
                    right--;
                }else{
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    // 去重：跳过相同的左值和右值
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return ans;
    }
}
