package study_plan_algorithm_Introductory;

// 无重复字符的最长子串

import java.util.HashSet;
import java.util.Set;

public class day_06_0003 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, left = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                ans = Math.max(ans,set.size());
            }else{
                while (set.contains(s.charAt(i))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(i));
            }
        }
        return ans;
    }
}

