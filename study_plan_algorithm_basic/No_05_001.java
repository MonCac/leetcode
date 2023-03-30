package study_plan_algorithm_basic;

// 438. 找到字符串中所有字母异位词

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_05_001 {
    public static void main(String[] args){
        findAnagrams("cbaebabacd","abc");
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int len1 = s.length(), len2 = p.length();
        if (len1 < len2) {
            return list;
        }
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0; i < len2; i++) {
            b[p.charAt(i) - 'a']++;
            a[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(a, b)){
            list.add(0);
        }
        for (int i = len2; i < len1; i++){
            a[s.charAt(i - len2) - 'a']--;
            a[s.charAt(i) - 'a']++;
            if (Arrays.equals(a, b)){
                list.add(i - len2 + 1);
            }
        }
        return list;
    }
}
