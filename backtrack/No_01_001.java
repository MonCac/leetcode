package backtrack;

// 77. 组合

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No_01_001 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTrack(n,k,1);
        return result;
    }
    public void backTrack(int n, int k, int start){
        if (path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n - k + path.size() + 1; i++){
            path.add(i);
            backTrack(n,k,i + 1);
            path.removeLast();
        }
    }
}
