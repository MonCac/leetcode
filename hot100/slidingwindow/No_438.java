package hot100.slidingwindow;

import java.util.*;

public class No_438 {
    public static void main(String[] args) {
        findAnagrams("abab", "ab");
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int lens = s.length();
        int lenp = p.length();
        List<Integer> ans = new ArrayList<>();
        StringBuilder sbs = new StringBuilder();
        StringBuilder sbp = new StringBuilder();
        if (lens < lenp){
            return ans;
        }
        for (int i = 0; i < lenp; i++){
            sbs.append(s.charAt(i));
            sbp.append(p.charAt(i));
        }
        if (compare(sbs,sbp)){
            ans.add(0);
        }
        for (int i = 1; i < lens - lenp + 1; i++){
            sbs.deleteCharAt(0);
            sbs.append(s.charAt(i + lenp - 1));
            if (compare(sbs,sbp)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean compare(StringBuilder sb1, StringBuilder sb2) {
        if (sb1 == null || sb2 == null) {
            return sb1 == sb2; // 都为 null 才算相等
        }
        // 顺序无关：排序后比较
        char[] arr1 = sb1.toString().toCharArray();
        char[] arr2 = sb2.toString().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
