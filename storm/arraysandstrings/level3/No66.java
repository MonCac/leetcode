package storm.arraysandstrings.level3;

// 加一

/*
给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class No66 {
    // 笨方法
    // 先判断是否需要扩容再递增
//    public int[] plusOne(int[] digits) {
//        int len = digits.length;
//        for (int i = len - 1; i > -1; i--) {
//            if (digits[i] != 9){
//                break;
//            }
//            if (i == 0){
//                int[] ans = new int[len + 1];
//                ans[0] = 1;
//                return ans;
//            }
//        }
//        for (int i = len - 1; i > -1; i--) {
//            if (digits[i] == 9) {
//                digits[i] = 0;
//            }else{
//                digits[i]++;
//                break;
//            }
//        }
//        return digits;
//    }

    // 先递增在判断是否需要扩容
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
