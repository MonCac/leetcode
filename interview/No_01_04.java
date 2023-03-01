package interview;

import java.util.HashMap;
import java.util.Map;

// 回文排列
public class No_01_04 {
    public boolean canPermutePalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        int flag = 0;
        for (Integer value : map.values()){
            if (value % 2 == 1){
                flag++;
                if (flag > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
