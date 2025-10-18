package hot100.substring;

import java.util.HashMap;
import java.util.Map;

public class No_560 {
    public static void main(String[] args){
        subarraySum(new int[]{1}, 1);
    }
    public static int subarraySum(int[] nums, int k) {
        int sum = 0, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int num: nums){
            sum += num;
            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
