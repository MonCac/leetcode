package a_daily_topic;

// 移动所有球到每个盒子所需的最小操作数

public class No_1769 {
    public static void main(String[] args){
        String a = "110";
        minOperations(a);
    }
    public static int[] minOperations(String boxes) {
        int left = boxes.charAt(0) - '0', right = 0, operations = 0;
        int n = boxes.length();
        for (int i = 1; i < n; i++) {
            if (boxes.charAt(i) == '1') {
                right++;
                operations += i;
            }
        }
        int[] res = new int[n];
        res[0] = operations;
        for (int i = 1; i < n; i++) {
            operations += left - right;
            if (boxes.charAt(i) == '1') {
                left++;
                right--;
            }
            res[i] = operations;
        }
        return res;
    }

}
