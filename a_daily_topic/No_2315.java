package a_daily_topic;

// 统计星号

public class No_2315 {
    public int countAsterisks(String s) {
        int ans = 0;
        boolean into = true;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '|'){
                into = !into;
            }
            if (into && s.charAt(i) == '*'){
                ans++;
            }
        }
        return ans;
    }
}
