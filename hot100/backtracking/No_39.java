package hot100.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_39 {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static void main(String[] args) {
        combinationSum(new int[]{2,3,6,7}, 7);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates, target, 0, 0);
        return res;
    }
    public static void backTracking(int[] candidates, int target, int index, int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (index == candidates.length) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (sum > target){
                return;
            }
            int j = 0;
            while (sum <= target) {
                sum += candidates[i];
                path.add(candidates[i]);
                backTracking(candidates, target, i + 1, sum);
                j++;
            }
            for (int k = 0; k < j; k++) {
                path.remove(path.size() - 1);
                sum -= candidates[i];
            }
        }
    }
}
