package interview;

// URL化

public class No_01_03 {
    public String replaceSpaces(String S, int length) {
        char[] s = S.toCharArray();
        int num = 0;
        for (int i = 0; i < length; i++){
            if (s[i] == ' '){
                num++;
            }
        }
        int num1 = num * 2 - 1 + length;
        for (int i = length - 1; i >= 0; i--){
            char c = S.charAt(i);
            if (c == ' '){
                s[num1 - 2] = '%';
                s[num1 - 1] = '2';
                s[num1] = '0';
                num1 -= 2;
            }else{
                s[num1] = c;
            }
            num1--;
        }
        return new String(s,0,num * 2 + length);
    }
}
