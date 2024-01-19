package storm.arraysandstrings.level3;

// 数组形式的整数加法

/*
整数的 数组形式  num 是按照从左到右的顺序表示其数字的数组。

例如，对于 num = 1321 ，数组形式是 [1,3,2,1] 。
给定 num ，整数的 数组形式 ，和整数 k ，返回 整数 num + k 的 数组形式 。
 */

import java.util.ArrayList;
import java.util.List;

public class No989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = num.length - 1; i >= 0; i--) {
            num[i] = num[i] + k;
            k = num[i] / 10;
            num[i] %= 10;
            result.add(0, num[i]);
        }
        while (k > 0) {
            result.add(0,k % 10);
            k /= 10;
        }
        return result;
    }
}
