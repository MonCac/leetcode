package hot100.backtracking;

import java.util.ArrayList;
import java.util.List;

public class No_22 {
    List<String> ans = new ArrayList<>();
    StringBuffer sb = new StringBuffer();
    public List<String> generateParenthesis(int n) {
        backTracking(n ,n);
        return ans;
    }
    public void backTracking(int left ,int right){
        if (right == 0){
            ans.add(sb.toString());
            return;
        }
        if (left > 0){
            sb.append("(");
            backTracking(left - 1, right);
            sb.deleteCharAt(sb.length()-1);
        }
        if (left < right){
            sb.append(")");
            backTracking(left, right - 1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
