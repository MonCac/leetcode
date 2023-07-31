package data_structure_tutorial;

// 整数反转

public class No_01_001 {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            int newResult = result * 10 + digit;

            // 检验是否溢出

            if ((newResult - digit) / 10 != result) {
                return 0;
            }

            result = newResult;
            x /= 10;
        }
        return result;
    }
}
