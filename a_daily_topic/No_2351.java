package a_daily_topic;

// 第一个出现两次的字母

public class No_2351 {
    public char repeatedCharacter(String s) {
        int[] ans = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ans[c - 'a']++;
            if (ans[c - 'a'] == 2){
                return c;
            }
        }
        return ' ';
    }
}
