package a_daily_topic;

// 字符串转化后的各位数字之和

public class No_1945 {
    public static void main(String[] args){
        String a = "vbyytoijnbgtyrjlsc";
        getLucky(a,2);

    }
    public static int getLucky(String s, int k) {
        int len = s.length();
        int[] str = new int[len];
        int ans = 0;
        for (int i = 0; i < len; i++){
            str[i] = s.charAt(i) - 'a' + 1;
            ans += str[i] % 10 + str[i] / 10;
        }
        if (k == 1){
            return ans;
        }
        int num = ans;
        ans = 0;
        while (k > 1){
            while (num > 0){
                ans += num % 10;
                num /= 10;
            }
            if (ans < 10){
                return ans;
            }else{
                num = ans;
                ans = 0;
            }
            k--;
        }
        return num;
    }
}
