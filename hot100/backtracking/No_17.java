package hot100.backtracking;

import java.util.ArrayList;
import java.util.List;

public class No_17 {
    List<String> ans = new ArrayList<>();
    StringBuilder total = new StringBuilder();
    public List<String> letterCombinations(String digits) {
        backTracking(digits, 0);
        return ans;
    }
    public void backTracking(String digits, int start){
        if (total.length() == digits.length()){
            ans.add(total.toString());
            return;
        }
        char[] chars = digits.toCharArray();
        for (char a : numGetStr(chars[start])){
            total.append(a);
            backTracking(digits, start + 1);
            total.deleteCharAt(total.length() - 1);
        }
    }
    public char[] numGetStr(char i){
        return switch (i) {
            case '2' -> new char[]{'a', 'b', 'c'};
            case '3' -> new char[]{'d', 'e', 'f'};
            case '4' -> new char[]{'g', 'h', 'i'};
            case '5' -> new char[]{'j', 'k', 'l'};
            case '6' -> new char[]{'m', 'n', 'o'};
            case '7' -> new char[]{'p', 'q', 'r', 's'};
            case '8' -> new char[]{'t', 'u', 'v'};
            case '9' -> new char[]{'w', 'x', 'y', 'z'};
            default -> null;
        };
    }
}

