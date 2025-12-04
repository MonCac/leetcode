package hot100.dynamicprogramming;

import java.util.*;

public class No_139_2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        for (String string : wordDict) {
            set.add(string);
        }
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        for (int i = 1; i < f.length; i++){
            for (String str : set){
                if (i >= str.length() && f[i - str.length()]){
                    if (s.substring(i-str.length(), i).equals(str)){
                        f[i] = true;
                        break;
                    }
                }
            }
        }
        return f[s.length()];
    }
}
