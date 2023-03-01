package a_daily_topic;

// 统计包含给定前缀的字符串

public class No_2185 {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
