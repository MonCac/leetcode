package hot100.hash;

// 49. 字母异位词分组

import java.util.*;

public class No_049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String out = Arrays.toString(chars);
            List<String> list = map.getOrDefault(out, new ArrayList<>());
            list.add(strs[i]);
            map.put(out, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
