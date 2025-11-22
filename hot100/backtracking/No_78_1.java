package hot100.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No_78_1 {
    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }
    static Set<Set<Integer>> set = new HashSet<>();
    static Set<Integer> ans = new HashSet<>();
    static Set<Integer> set1 = new HashSet<>();
    public static List<List<Integer>> subsets(int[] nums) {
        backTracking(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (Set<Integer> set : set) {
            res.add(new ArrayList<>(set));
        }
        return res;
    }
    public static void backTracking(int[] nums) {
        if (!set.contains(ans)){
            set.add(new HashSet<>(ans));
        }
        if (set1.size() == nums.length) {
            return;
        }
        for (int num : nums) {
            if (set1.contains(num)) {
                continue;
            }
            set1.add(num);
            ans.add(num);
            backTracking(nums);
            ans.remove(num);
            set1.remove(num);
        }
    }
}
