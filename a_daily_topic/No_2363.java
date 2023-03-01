package a_daily_topic;

// 合并相似的物品

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Arrays.sort(items1, (a, b) -> a[0] - b[0]);
        Arrays.sort(items2,(a,b) -> a[0] - b[0]);
        List<List<Integer>> ans = new ArrayList<>();
        int left = 0, right = 0;
        while (left < items1.length && right < items2.length) {
            List<Integer> list = new ArrayList<>();
            if (items1[left][0] == items2[right][0]) {
                list.add(items1[left][0]);
                list.add(items1[left][1] + items2[right][1]);
                left++;
                right++;
            } else if (items1[left][0] > items2[right][0]) {
                list.add(items2[right][0]);
                list.add(items2[right][1]);
                right++;
            }else {
                list.add(items1[left][0]);
                list.add(items1[left][1]);
                left++;
            }
            ans.add(list);
        }
        getAns(items1, ans, left);
        getAns(items2, ans, right);
        return ans;
    }

    public void getAns(int[][] items2, List<List<Integer>> ans, int right) {
        while (right < items2.length){
            List<Integer> list = new ArrayList<>();
            list.add(items2[right][0]);
            list.add(items2[right][1]);
            right++;
            ans.add(list);
        }
    }
}
