package a_daily_topic;

// 所有子字符串美丽值之和

public class No_1781 {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0;i < s.length();++i) {
            int[] count = new int[26];
            for (int j = i;j < s.length();++j) {
                char ch = s.charAt(j);
                count[ch - 'a'] += 1;
                int maxValue = Integer.MIN_VALUE;
                int minValue = Integer.MAX_VALUE;
                for (Integer value: count) {
                    if (value > 0 && value > maxValue) {
                        maxValue = value;
                    }
                    if (value > 0 && value < maxValue) {
                        minValue = value;
                    }
                }
                ans += (maxValue - minValue);
            }
        }
        return ans;
    }
}
