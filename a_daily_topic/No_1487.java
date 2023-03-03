package a_daily_topic;

// 保证文件名唯一

import java.util.HashMap;
import java.util.Map;

public class No_1487 {
    public static void main(String[] args){
        String[] names = new String[]{"gta","gta","gta(1)","avalon"};
        getFolderNames(names);
    }

    public static String[] getFolderNames(String[] names) {
        Map<String, Integer> index = new HashMap<String, Integer>();
        int n = names.length;
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            String name = names[i];
            if (!index.containsKey(name)) {
                res[i] = name;
                index.put(name, 1);
            } else {
                int k = index.get(name);
                while (index.containsKey(addSuffix(name, k))) {
                    k++;
                }
                res[i] = addSuffix(name, k);
                index.put(name, k + 1);
                index.put(addSuffix(name, k), 1);
            }
        }
        return res;
    }

    public static String addSuffix(String name, int k) {
        return name + "(" + k + ")";
    }
}
