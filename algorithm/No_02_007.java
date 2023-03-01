package algorithm;

// 剑指 Offer 48. 最长不含重复字符的子字符串

import java.util.HashSet;
import java.util.Set;

public class No_02_007 {
    public static void main(String[] args){
        lengthOfLongestSubstring("abcabcbb");
    }
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                ans = Math.max(ans,right - left);
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
    }
}
