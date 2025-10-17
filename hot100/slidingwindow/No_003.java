package hot100.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class No_003 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int start = 0;
        Set<Character> set = new HashSet<>();
        char[] sb = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(sb[i])){
                set.add(sb[i]);
            }else{
                ans = Math.max(set.size(), ans);
                while (sb[start] != sb[i]){
                    set.remove(sb[start]);
                    start++;
                }
                start++;
            }
        }
        ans = Math.max(set.size(), ans);
        return ans;
    }
}
