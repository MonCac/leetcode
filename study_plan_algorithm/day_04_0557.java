package study_plan_algorithm;

// 反转字符串中的单词 III

public class day_04_0557 {
    public static void main(String[] args){
        String s = "i love u";
        reverseWords(s);
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            while(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
                i++;
                if (i == s.length()){
                    break;
                }
            }
            if (sb.length() > 1){
                ans.append(reverseWords1(sb.toString()));
            }else{
                ans.append(sb.toString());
            }
            ans.append(" ");
            sb.setLength(0);
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }

    public static String reverseWords1(String s){
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int left = -1, right = -1;
        if (len % 2 == 1){
            sb.append(s.charAt(len/2));
            left = len/2 - 1;
            right = len/2 + 1;
        }else{
            left = len/2 - 1;
            right = len/2;
        }
        while (left >= 0){
            sb.append(s.charAt(left));
            sb.insert(0,s.charAt(right));
            left--;
            right++;
        }
        return sb.toString();
    }
}
