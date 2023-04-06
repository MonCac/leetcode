package backtrack;

// 17. 电话号码的字母组合

import java.util.ArrayList;
import java.util.List;

public class No_01_003 {
    List<char[]> letters = new ArrayList<>();
    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public void addLetters(){
        letters.add((new char[] {'a','b','c'}));
        letters.add((new char[] {'d','e','f'}));
        letters.add((new char[] {'g','h','i'}));
        letters.add((new char[] {'j','k','l'}));
        letters.add((new char[] {'m','n','o'}));
        letters.add((new char[] {'p','q','r','s'}));
        letters.add((new char[] {'t','u','v'}));
        letters.add((new char[] {'w','x','y','z'}));

    }
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0){
            return result;
        }
        addLetters();
        backTrack(digits,0);
        return result;
    }
    public void backTrack(String digits, int start){
        if (start == digits.length()){
            result.add(sb.toString());
            return;
        }
        for (int i = 0; i < letters.get(digits.charAt(start) - '2').length; i++){
            sb.append(letters.get(digits.charAt(start) - '2')[i]);
            backTrack(digits,start + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
