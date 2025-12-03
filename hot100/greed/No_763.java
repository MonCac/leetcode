package hot100.greed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> letters = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            letters.put(chars[i], i);
        }
        int i = 0;
        int sum;
        int index = 0;
        while (i < chars.length){
            sum = letters.get(chars[i]);
            while (i <= sum){
                sum = Math.max(sum, letters.get(chars[i]));
                i++;
            }
            ans.add(i - index);
            index = i;
        }
        return ans;
    }
}
