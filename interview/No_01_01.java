package interview;

// 判定字符是否唯一

public class No_01_01 {
    public boolean isUnique(String astr) {
        for (int i = 0; i < astr.length(); i++){
            char a = astr.charAt(i);
            if (astr.indexOf(a,i + 1) != -1){
                return false;
            }
        }
        return true;
    }
}
