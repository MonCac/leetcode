package a_daily_topic;

// 交换字符使得字符串相同

public class No_1247 {
    public int minimumSwap(String s1, String s2) {
        if (s1.length()!= s2.length()) {
            return -1;
        }
        int m = 0, n = 0;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == s2.charAt(i)){
                continue;
            }
            if (s1.charAt(i) == 'x'){
                m++;
            }else{
                n++;
            }
        }
        if (Math.abs(m - n) % 2 == 1){
            return -1;
        }else{
            if (m % 2 == 1){
                return (m + n) / 2 + 1;
            }else{
                return (m + n) / 2;
            }
        }
    }
}
