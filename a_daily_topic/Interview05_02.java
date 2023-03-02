package a_daily_topic;

// 面试题05.02. 二进制数转字符串

public class Interview05_02 {
    public String printBin(double num) {
        StringBuilder sb = new StringBuilder();
        sb.append("0.");
        while (num != 0){
            if (sb.length() > 34){
                return "ERROR";
            }
            num = num * 2;
            if (num >= 1){
                sb.append("1");
                num -= 1;
            }else{
                sb.append("0");
            }
        }
        return sb.toString();
    }
}
