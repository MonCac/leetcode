package data_structure_tutorial;

// 二进制求和

public class No_02_001 {
    public static void main(String[] args){
        String a = "100";
        String b = "110010";
        addBinary(a,b);
    }
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        int len1 = a.length();
        int len2 = b.length();
        int len_min = Math.min(len1, len2);
        for (int i = 0; i < len_min; i++) {
            int index1 = a.charAt(len1 - i - 1) - '0';
            int index2 = b.charAt(len2 - i - 1) - '0';
            int sum = index1 + index2 + flag;
            if (sum < 2){
                flag = 0;
                sb.insert(0, sum);
            }else{
                flag = 1;
                sb.insert(0,sum - 2);
            }
        }
        if (len1 != len2){
            if (len1 > len2){
                for (int i = len2; i < len1; i++) {
                    int index1 = a.charAt(len1 - i - 1) - '0';
                    int sum = index1 + flag;
                    if (sum < 2){
                        flag = 0;
                        sb.insert(0, sum);
                    }else{
                        flag = 1;
                        sb.insert(0,sum - 2);
                    }
                }
            }else{
                for (int i = len1; i < len2; i++) {
                    int index1 = b.charAt(len2 - i - 1) - '0';
                    int sum = index1 + flag;
                    if (sum < 2){
                        flag = 0;
                        sb.insert(0, sum);
                    }else{
                        flag = 1;
                        sb.insert(0,sum - 2);
                    }
                }
            }
        }
        if (flag == 1){
            sb.insert(0,1);
        }
        return sb.toString();
    }
}
