package algorithm;

// 剑指Offer 05. 替换空格

public class No_01_001 {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
