package a_daily_topic;

// 替换字符串中的括号内容

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_1807 {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        for (List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '('){
                StringBuilder sb1 = new StringBuilder();
                i++;
                while (s.charAt(i) != ')'){
                    sb1.append(s.charAt(i));
                    i++;
                }

                i--;
            }else {
                sb.append(c);
            }
        }
        return null;
    }
}
