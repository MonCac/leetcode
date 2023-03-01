package a_daily_topic;

// 使数组中所有元素都等于零

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class No_2357 {
    public int minimumOperations(int[] nums) {
        int flag = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (!set.contains(nums[i])){
                set.add(nums[i]);
            }
            if (nums[i] == 0){
                flag = 1;
            }
        }

        return set.size() - flag;
    }
}
