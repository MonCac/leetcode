package lanqiaobisai;

// 特殊日期

import javax.xml.crypto.Data;

public class No_001 {

    private static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args){
        int year;
        int month;
        int day;
        int ans = 0;
        for (year = 2000; year <= 2000; year++){
            for (month = 1; month <= 1; month++){
                for (day = 1; day <= 31; day++){
                    if (!judge(year, month, day)){
                        continue;
                    }
                    if (year % month == 0 && year % day == 0){
                        ans++;
                        System.out.println(day);
                    }
                }
            }
        }
        System.out.println(ans);
    }
    public static boolean judge(int year, int month, int day){
        //首先判断月份是否合法
        if (month >= 1 && month <= 12){
            //判断是否为闰年
            if ((year % 100 == 0 && year % 400 == 0) || year % 4 == 0){
                //判断当前月份是否为2月,因为闰年的2月份为29天
                if (month == 2 && day <= 29) {
                    return true;
                } else {
                    if (day <= days[month-1]) {
                        return true;
                    }
                }
            }else {
                if (day <= days[month-1]) {
                    return true;
                }
            }
        }
        return false;
    }

}
