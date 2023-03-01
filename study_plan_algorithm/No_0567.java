package study_plan_algorithm;

// 字符串的排列

import java.util.HashSet;
import java.util.Set;

public class No_0567 {
    public static void main(String[] args){
        checkInclusion("ab","eidboaoo");
    }
    public static boolean checkInclusion(String s1, String s2) {
        int[] ans = new int[26];
        int len1 = s1.length(), len2 = s2.length();
        for (int i = 0; i < len1; i++){
            ans[s1.charAt(i) - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < len2; right++){
            ans[s2.charAt(right) - 'a']--;
            while (ans[s2.charAt(right) - 'a'] < 0){
                ans[s2.charAt(left) - 'a']++;
                left++;
            }
            if (right - left + 1 == len1){
                return true;
            }
        }
        return false;
    }
}
