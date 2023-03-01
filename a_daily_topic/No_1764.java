package a_daily_topic;

// 通过链接另一个数组的子数组得到一个数组

import java.util.Arrays;

public class No_1764 {
    public boolean canChoose(int[][]groups, int[] nums){
        int i = 0;
        for (int k = 0; k < nums.length && i < groups.length;){
            if (check(groups[i], nums, k)){
                k += groups[i].length;
                i++;
            }else{
                k++;
            }
        }
        return i == groups.length;
    }

    public boolean check(int[] g, int[] nums, int k){
        if (k + g.length > nums.length){
            return false;
        }
        for (int j = 0; j < g.length; j++){
            if (g[j] != nums[k + j]){
                return false;
            }
        }
        return true;
    }
}
