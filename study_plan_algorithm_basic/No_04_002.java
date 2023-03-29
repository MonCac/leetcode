package study_plan_algorithm_basic;

// 986. 区间列表的交集

import java.util.ArrayList;
import java.util.List;

public class No_04_002 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < firstList.length && j < secondList.length){
            int li = Math.max(firstList[i][0],secondList[j][0]);
            int ri = Math.min(firstList[i][1],secondList[j][1]);
            if (li <= ri){
                list.add(new int[]{li,ri});
            }
            if (firstList[i][1] < secondList[j][1]){
                i++;
            }else{
                j++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
