package leetbooks.intermediate_algorithms;

// 最长回文子串

public class No_01_005 {
    public static void main(String[] args){
        String s = "babad";
        String a = longestPalindrome(s);
    }
    public static String longestPalindrome(String s) {
        int ans = 0;
        int start = -1;
        int len = s.length();
        if (len == 1){
            return s;
        }
        for (int i = 0; i < len; i++){
            int left = i - 1, right = i + 1;
            while (left >= 0 && right < len){
                if (s.charAt(left) == s.charAt(right)){
                    if (ans < right - left + 1){
                        ans = right - left + 1;
                        start = left;
                    }
                }else{
                    break;
                }
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < len){
                if (s.charAt(left) == s.charAt(right)){
                    if (ans < right - left + 1){
                        ans = right - left + 1;
                        start = left;
                    }
                }else{
                    break;
                }
                left--;
                right++;
            }
        }
        if (start == -1){
            return String.valueOf(s.charAt(0));
        }
        return s.substring(start, start + ans);
    }
}
