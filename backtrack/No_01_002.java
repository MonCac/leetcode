package backtrack;

// 216. 组合总和 III

import java.util.*;

public class No_01_002 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(k,n,1,0);
        return result;
    }
    public void backTrack(int k, int n, int start, int num){
        if (path.size() == k && num == n){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; path.size() <= k && i < 10 && num + i <= n; i++){
            num += i;
            path.add(i);
            backTrack(k,n,i + 1,num);
            path.removeLast();
            num -= i;
        }
    }
}
