package hot100.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_139_1 {
    public static void main(String[] args){
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        wordBreak("leetcode", wordDict);
    }
    static boolean isWord = false;
    public static boolean wordBreak(String s, List<String> wordDict) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String str : wordDict) {
            int len = str.length();
            List<String> list = map.getOrDefault(len, new ArrayList<>());
            list.add(str);
            map.put(len, list);
        }
        getWordBreak(s, 0, map);
        return isWord;
    }
    public static void getWordBreak(String s, int index, Map<Integer, List<String>> map){
        if (s.length() == index){
            isWord = true;
            return;
        }
        for (int i : map.keySet()){
            List<String> list = map.get(i);
            for (int j = 0; j < list.size(); j++){
                if (i + index > s.length()){
                    continue;
                }
                if (s.substring(index, i + index).equals(list.get(j))){
                    getWordBreak(s, index + i, map);
                }
            }
        }
    }
}
