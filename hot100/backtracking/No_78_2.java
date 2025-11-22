package hot100.backtracking;

import java.util.ArrayList;
import java.util.List;

public class No_78_2 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums, -1);
        return res;
    }
    public void backTracking(int[] nums, int start) {
        res.add(new ArrayList<>(list));
        if (list.size() == nums.length) {
            return;
        }
        for (int i = start + 1; i < nums.length; i++) {
            list.add(nums[i]);
            backTracking(nums, i);
            list.removeLast();
        }

    }
}
