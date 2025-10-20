package hot100.substring;

public class No_76 {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
    public static String minWindow(String s, String t) {
        int maxlen = s.length() + 1;
        int left = 0, right = 0, distance = 0, start = 0;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int[] sInts = new int[128];
        int[] tInts = new int[128];
        for (int i = 0; i < t.length(); i++){
            tInts[tArray[i]]++;
        }
        while (right < s.length()){
            if (tInts[sArray[right]] == 0){
                right++;
                continue;
            }
            if (sInts[sArray[right]] < tInts[sArray[right]]){
                distance++;
            }
            sInts[sArray[right]]++;
            right++;
            while (distance == t.length()){
                if (tInts[sArray[left]] == 0){
                    left++;
                    continue;
                }
                if (maxlen > (right - left)){
                    maxlen = right - left;
                    start = left;
                }
                if (sInts[sArray[left]] == tInts[sArray[left]]){
                    distance--;
                }
                sInts[sArray[left]]--;
                left++;
            }
        }
        if (maxlen < s.length() + 1){
            return s.substring(start, start + maxlen);
        }else{
            return "";
        }
    }
}
