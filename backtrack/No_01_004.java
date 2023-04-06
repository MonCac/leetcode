package backtrack;

// 39. 组合求和

import java.util.*;

public class No_01_004 {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    LinkedList<Integer> path = new LinkedList<Integer>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates,target,0,0);
        return result;
    }
    public void backTrack(int[] candidates, int target, int start, int sum){
        if (sum == target){
            result.add(new ArrayList<>(path));
            return;
        }
        if (sum > target){
            return;
        }
        for (int i = start; i < candidates.length; i++){
            sum += candidates[i];
            path.add(candidates[i]);
            backTrack(candidates,target,i, sum);
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
