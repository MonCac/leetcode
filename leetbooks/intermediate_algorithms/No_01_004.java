package leetbooks.intermediate_algorithms;

// 无重复字符的最长子串

import java.util.HashSet;
import java.util.Set;

public class No_01_004 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int len = s.length();
        if (len == 0){
            return ans;
        }
        Set<Character> set = new HashSet<>();
        int left = 0;
        for (int i = 0; i < len; i++){
            if (!set.contains(s.charAt(i))){
                ans = Math.max(i - left + 1, ans);
            }else{
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(s.charAt(i));
        }
        return ans;
    }
}
