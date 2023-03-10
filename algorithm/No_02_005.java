package algorithm;

// 剑指 Offer 46. 把数字翻译成字符串

public class No_02_005 {
    public static void main(String[] args){
        translateNum(9121);
    }
    public static int translateNum(int num) {
        int a = 1, b = 1, x, y = num % 10;
        while(num > 9) {
            num /= 10;
            x = num % 10;
            int tmp = 10 * x + y;
            int c = (tmp >= 10 && tmp <= 25) ? a + b : a;
            b = a;
            a = c;
            y = x;
        }
        return a;
    }
}
