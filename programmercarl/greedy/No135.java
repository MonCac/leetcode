package programmercarl.greedy;

// 135. 分发糖果

import java.util.Arrays;
import java.util.Comparator;

public class No135 {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{0,1,2,3,2,1}));
    }
    public static int candy(int[] ratings) {
        int ans = 0;
        int len = ratings.length;
        if (len == 1){
            return 1;
        }
        Integer[] indices = new Integer[len];
        for (int i = 0; i < len; i++) {
            indices[i] = i;
        }

        // 根据 ratings 中的值对索引数组排序
        Arrays.sort(indices, Comparator.comparing(i -> ratings[i]));
        // 此时 indices 中存储的即为排序过后的 ratings 数组的值原来的索引
        int[] sum = new int[len];
        for (int i = 0; i < len; i++){
            sum[i] = 1;
        }

        for (int i = 0; i < len; i++){
            int index = indices[i];
            if (index == 0){
                if (ratings[index + 1] > ratings[index] && sum[index + 1] <= sum[index]) {
                    sum[index + 1] = sum[index] + 1;
                }
                continue;
            }
            if (index == len - 1){
                if (ratings[index - 1] > ratings[index] && sum[index - 1] <= sum[index]){
                    sum[index - 1] = sum[index] + 1;
                }
                continue;
            }
            if (ratings[index + 1] > ratings[index] && sum[index + 1] <= sum[index]) {
                sum[index + 1] = sum[index] + 1;
            }
            if (ratings[index - 1] > ratings[index] && sum[index - 1] <= sum[index]){
                sum[index - 1] = sum[index] + 1;
            }
        }

        for (int i = 0; i < len; i++){
            ans += sum[i];
        }
        return ans;
    }
}
