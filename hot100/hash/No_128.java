package hot100.hash;

// 128. 最长连续序列

import java.util.HashSet;
import java.util.Set;

public class No_128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int sum = 1;
                while (set.contains(num + 1)){
                    sum++;
                    num++;
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
