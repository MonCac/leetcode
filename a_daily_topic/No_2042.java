package a_daily_topic;

// 检查句子中的数字是否递增

import java.util.ArrayList;
import java.util.List;

public class No_2042 {
    public boolean areNumbersAscending(String s) {
        int pre = 0, pos = 0;
        while (pos < s.length()) {
            if (Character.isDigit(s.charAt(pos))) {
                int cur = 0;
                while (pos < s.length() && Character.isDigit(s.charAt(pos))) {
                    cur = cur * 10 + s.charAt(pos) - '0';
                    pos++;
                }
                if (cur <= pre) {
                    return false;
                }
                pre = cur;
            } else {
                pos++;
            }
        }
        return true;
    }
}
