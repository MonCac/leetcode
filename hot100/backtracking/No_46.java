package hot100.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No_46 {
    public static void main(String[] args) {
        permute(new int[]{1,2,3});
    }
    static List<List<Integer>> ans = new ArrayList<>();
    static List<Integer> res = new ArrayList<>();
    static Set<Integer> set = new HashSet<>();
    public static List<List<Integer>> permute(int[] nums) {
        backTracking(nums);
        return ans;
    }
    public static void backTracking(int[] nums) {
        if (set.size() == nums.length) {
            ans.add(new ArrayList<>(res));
            return;
        }
        for (int num : nums) {
            if (set.contains(num)) {
                continue;
            }
            set.add(num);
            res.add(num);
            backTracking(nums);
            set.remove(num);
            res.removeLast();
        }
    }
}
