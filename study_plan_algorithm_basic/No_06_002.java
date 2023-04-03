package study_plan_algorithm_basic;

// 547. 省份数量

import javax.xml.namespace.QName;
import java.util.LinkedList;
import java.util.Queue;

public class No_06_002 {
    public static void main(String[] args) {
        int[][] isConnected = new int[4][4];
        isConnected[0] = new int[]{1,0,0,1};
        isConnected[1] = new int[]{0,1,1,0};
        isConnected[2] = new int[]{0,1,1,1};
        isConnected[3] = new int[]{1,0,1,1};
        findCircleNum(isConnected);
    }
    public static int findCircleNum(int[][] isConnected) {
        int ans = 0;
        int m = isConnected.length;
        int n = isConnected[0].length;
        if (m == 1){
            return 1;
        }
        int[] inContain = new int[m];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            if (inContain[i] == 0){
                inContain[i] = 1;
                queue.add(i);
                ans++;
            }
            while (!queue.isEmpty()){
                int num = queue.poll();
                for (int j = 0; j < n; j++){
                   if (isConnected[num][j] == 1 && inContain[j] == 0){
                       inContain[j] = 1;
                       queue.add(j);
                   }
                }
            }
        }
        return ans;
    }
}
