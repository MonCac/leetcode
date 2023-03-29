package study_plan_algorithm_basic;

// 844. 比较含退格的字符串

public class No_04_001 {
    public static void main(String[] args){
        backspaceCompare("xywrrmp","xywrrmu#p");
    }
    public static boolean backspaceCompare(String s, String t) {
        int n1 = s.length() - 1, n2 = t.length() - 1;
        int skip1 = 0, skip2 = 0;
        while (n1 >= 0 || n2 >= 0) {
            while (n1 >= 0){
                if (s.charAt(n1) == '#'){
                    skip1++;
                    n1--;
                }else if(skip1 > 0){
                    n1--;
                    skip1--;
                }else{
                    break;
                }
            }
            while (n2 >= 0){
                if (t.charAt(n2) == '#'){
                    skip2++;
                    n2--;
                }else if(skip2 > 0){
                    n2--;
                    skip2--;
                }else{
                    break;
                }
            }
            if (n1 >= 0 && n2 >= 0){
                if (s.charAt(n1) != t.charAt(n2)){
                    return false;
                }
            }else{
                if (n1 >= 0 || n2 >= 0){
                    return false;
                }
            }
            n1--;
            n2--;
        }
        return true;
    }
}
