package hot100.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_51 {
    public static void main(String[] args) {
        solveNQueens(4);
    }
    static Map<Integer, Integer> map = new HashMap<>();
    static List<String> list = new ArrayList<>();
    static List<List<String>> res = new ArrayList<>();
    public static List<List<String>> solveNQueens(int n) {
        backTracking(n, 0);
        return res;
    }
    public static void backTracking(int n, int start){
        if (start == n){
            res.add(new ArrayList<>(list));
            return;
        }
        out: for (int i = 0; i < n; i++) {
            if (map.containsKey(i)){
                continue;
            }
            for (int key : map.keySet()) {
                int value = map.get(key);
                int col = key - i;
                int row = value - start;
                if (Math.abs(row) == Math.abs(col)){
                    continue out;
                }
            }
            String queen = getString(i, n);
            list.add(queen);
            map.put(i, start);
            backTracking(n, start + 1);
            map.remove(i);
            list.removeLast();
        }
    }
    public static String getString(int num, int len){
        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            if (i == num){
                chars[i] = 'Q';
            }else{
                chars[i] = '.';
            }
        }
        return new String(chars);
    }
}
