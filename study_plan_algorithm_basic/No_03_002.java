package study_plan_algorithm_basic;

// 15. 三数之和

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_03_002 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int len = nums.length;
        Arrays.sort(nums);
        if (nums[0] > 0 || nums[len - 1] < 0){
            return ans;
        }
        for (int i = 0; i < len; i++){
            if (nums[i] > 0){
                return ans;
            }
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1, right = len - 1;
            int curr = nums[i];
            while (left < right){
                int tmp = curr + nums[left] + nums[right];
                if (tmp == 0){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(curr);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    while (left < right && nums[left + 1] == nums[left]){
                        left++;
                    }
                    while (left < right && nums[right - 1] == nums[right]){
                        right--;
                    }
                    right--;
                    left++;
                }
                if (tmp < 0){
                    left++;
                }
                if (tmp > 0){
                    right--;
                }
            }
        }
        return ans;
    }

}
