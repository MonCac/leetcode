package hot100.graphtheory;

import java.util.*;

public class No_207 {
    public static void main(String[] args) {
        int[][] prerequisites = {
                {0, 10},
                {3, 18},
                {5, 5},
                {6, 11},
                {11, 14},
                {13, 1},
                {15, 1},
                {17, 4}
        };
        canFinish(20, prerequisites);
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer> ans = new HashSet<>();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int[] nums : prerequisites) {
            if (!graph.containsKey(nums[0])) {
                graph.put(nums[0], new HashSet<>());
            }
            graph.get(nums[0]).add(nums[1]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (!graph.containsKey(i)) {
                ans.add(i);
            }
        }
        while (!ans.isEmpty()){
            Integer[] cur = ans.toArray(new Integer[0]);
            ans.clear();
            for (Integer num : cur){
                List<Integer> keysToRemove = new ArrayList<>();
                for(Map.Entry<Integer, Set<Integer>> entry : graph.entrySet()){
                    Integer key = entry.getKey();
                    Set<Integer> set = entry.getValue();
                    if (set.contains(num)){
                        set.remove(num);
                    }
                    if (set.isEmpty()){
                        keysToRemove.add(key);
                        ans.add(key);
                    }
                }
                for (Integer key : keysToRemove){
                    graph.remove(key);
                }
            }
        }
        return graph.isEmpty();
    }
}
