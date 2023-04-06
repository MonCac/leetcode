package backtrack;

// 50. 组合总和 II

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class No_01_005 {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    LinkedList<Integer> path = new LinkedList<Integer>();
    int sum = 0;
    boolean[] used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        used = new boolean[candidates.length];
        Arrays.fill(used,false);
        backTrack(candidates,target,0);
        return result;
    }
    public void backTrack(int[] candidates, int target, int start){
        if (sum == target){
            result.add(new ArrayList<>(path));
            return;
        }
        if (sum > target){
            return;
        }
        for (int i = start; i < candidates.length; i++){
            if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]){
                continue;
            }
            sum += candidates[i];
            used[i] = true;
            path.add(candidates[i]);
            backTrack(candidates,target,i + 1);
            sum -= candidates[i];
            used[i] = false;
            path.removeLast();
        }
    }
}
