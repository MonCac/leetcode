package algorithm;

// 剑指Offer 58 - II. 左旋转字符串

public class No_01_008 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s.substring(n,s.length()));
        sb.append(s.substring(0,n));
        return sb.toString();
    }
}
