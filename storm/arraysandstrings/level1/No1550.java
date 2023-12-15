package storm.arraysandstrings.level1;

// 存在连续三个奇数的数组
//给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：
// 如果存在，请返回 true ；否则，返回 false 。

public class No1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 1) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
