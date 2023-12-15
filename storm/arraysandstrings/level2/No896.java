package storm.arraysandstrings.level2;

// 单调数列

/*
如果数组是单调递增或单调递减的，那么它是 单调 的。

如果对于所有 i <= j，nums[i] <= nums[j]，那么数组 nums 是单调递增的。 如果对于所有 i <= j，nums[i]> = nums[j]，那么数组 nums 是单调递减的。

当给定的数组 nums 是单调数组时返回 true，否则返回 false。
 */
public class No896 {
    // 笨办法
//    public boolean isMonotonic(int[] nums) {
//        if (nums.length == 1) {
//            return true;
//        }
//        int flag = -1;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] < nums[i + 1]) {
//                if (flag == -1) {
//                    flag = 0;
//                }
//                if (flag == 1) {
//                    return false;
//                }
//            }
//            if (nums[i] > nums[i + 1]){
//                if (flag == -1) {
//                    flag = 1;
//                }
//                if (flag == 0) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


    // 一次遍历
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1){
            return true;
        }
        boolean inc = true, dec = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]){
                inc = false;
            }
            if (nums[i + 1] > nums[i]){
                dec = false;
            }
        }
        return inc || dec;
    }
}
