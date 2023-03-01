package god_xiao;

import java.util.HashMap;
import java.util.Map;

public class T1781 {
    //一个字符串的 美丽值定义为：出现频率最高字符与出现频率最低字符的出现次数之差。
    //比方说，"abaacc"的美丽值为3 - 1 = 2。
    //给你一个字符串s，请你返回它所有子字符串的美丽值之和。
    public static void main(String[] args) {
        System.out.println(beautySum("aabcbaa"));
    }

    public static int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            Map<Character, Integer> map = new HashMap<>();
            char max = s.charAt(i);
            char min = s.charAt(i);
            for (int j = i; j < s.length(); j++) {
                int value = map.getOrDefault(s.charAt(j), -1);
                if (value != -1) {
                    map.put(s.charAt(j), value + 1);
                    if (min == s.charAt(j)) {
                        min = minValue(map, 1, s.charAt(j));
                    }

                    if (map.get(max) < map.get(s.charAt(j))) {
                        max = s.charAt(j);
                    }
                } else {
                    map.put(s.charAt(j), 1);
                    min = s.charAt(j);
                }
                sum += map.get(max) - map.get(min);
            }
        }
        return sum;
    }

    public static char minValue(Map<Character, Integer> map, int value, char c) {
        char key;
        //Map,HashMap并没有实现Iteratable接口.不能用于增强for循环.
        for (char getKey : map.keySet()) {
            if (map.get(getKey).equals(value)) {
                key = getKey;
                return key;
            }
        }
        return c;
    }
}
