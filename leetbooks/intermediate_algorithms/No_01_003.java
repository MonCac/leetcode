package leetbooks.intermediate_algorithms;

// 字母异位词分组

import java.util.*;

public class No_01_003 {
    public static void main(String[] args){
        String[] a = new String[]{"eat","tea","tan","nat"};
        groupAnagrams(a);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String cs = String.valueOf(c);
            if (!map.containsKey(cs)) {
                map.put(cs, new ArrayList<>());
            }
            map.get(cs).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
