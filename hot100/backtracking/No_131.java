package hot100.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_131 {
    public static void main(String[] args) {
        String s = "aab";
        partition(s);
    }
    static List<List<String>> res = new ArrayList<>();
    static List<String> ans = new ArrayList<>();
    static Map<Integer, int[]> map = new HashMap<>();
    public static List<List<String>> partition(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int[] substring = getBackSubstring(chars, i);
            map.put(i, substring);
        }
        backTracking(s,0);
        return res;
    }
    public static void backTracking(String s, int start){
        if(start == s.length()){
            res.add(new ArrayList<>(ans));
            return;
        }
        int[] substring = map.get(start);
        for (int i : substring){
            ans.add(s.substring(start, i+1));
            backTracking(s, i+1);
            ans.removeLast();
        }
    }

    // 得到回文串的所有下标
    public static int[] getBackSubstring(char[] chars, int k) {
        int left = k;
        List<Integer> list = new ArrayList<>();
        out: for (int i = k; i < chars.length; i++) {
            left = k;
            int right = i;
            while (left <= right){
                if (chars[left] == chars[right]){
                    left++;
                    right--;
                }else{
                    continue out;
                }
            }
            list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
