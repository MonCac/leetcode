package programmercarl.hashtable;

// 两个数组的交集

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class No349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }
        return ans.stream().mapToInt(x -> x).toArray();
    }
}
