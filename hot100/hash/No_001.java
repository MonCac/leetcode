package hot100.hash;

// 1. 两数之和

import java.util.HashMap;
import java.util.Map;

public class No_001 {
    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15}, 9);
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.isEmpty() && map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }else{
                int value = target - nums[i];
                map.put(value, i);
            }
        }
        return null;
    }
}
