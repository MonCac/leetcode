package study_plan_algorithm_basic;

// 797. 所有可能的路径

import java.util.*;

public class No_08_003 {
    public static void main(String[] args){
        int[][] graph = new int[4][];
        graph[0] = new int[]{1,2};
        graph[1] = new int[]{3};
        graph[2] = new int[]{3};
        allPathsSourceTarget(graph);
    }
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        int len = graph.length;
        queue.add(new ArrayList<Integer>(){{add(0);}});
        while (!queue.isEmpty()){
            List<Integer> list = queue.poll();
            int m = list.get(list.size() - 1);
            if (m == len - 1){
                ans.add(list);
            }else{
                for (int i = 0; i < graph[m].length; i++){
                    List<Integer> list2 = new ArrayList<>(list);
                    list2.add(graph[m][i]);
                    queue.add(list2);
                }
            }
        }
        return ans;
    }
}
