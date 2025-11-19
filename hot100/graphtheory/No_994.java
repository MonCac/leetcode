package hot100.graphtheory;

import java.util.Deque;
import java.util.LinkedList;

public class No_994 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        orangesRotting(grid);
    }
    public static int orangesRotting(int[][] grid) {
        Deque<int[]> deque = new LinkedList<>();
        int ans = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    deque.push(new int[]{i, j});
                }
            }
        }
        int len = deque.size();
        if (len == 0) return 0;
        while (len > 0){
            int[] cur = deque.pollLast();
            if (cur[0] > 0 && grid[cur[0] - 1][cur[1]] == 1) {
                grid[cur[0] - 1][cur[1]] = 2;
                deque.offerFirst(new int[]{cur[0] - 1, cur[1]});
            }
            if (cur[0] + 1 < grid.length && grid[cur[0] + 1][cur[1]] == 1) {
                grid[cur[0] + 1][cur[1]] = 2;
                deque.offerFirst(new int[]{cur[0] + 1, cur[1]});
            }
            if (cur[1] > 0 && grid[cur[0]][cur[1] - 1] == 1) {
                grid[cur[0]][cur[1] - 1] = 2;
                deque.offerFirst(new int[]{cur[0], cur[1] - 1});
            }
            if (cur[1] + 1 < grid[0].length && grid[cur[0]][cur[1] + 1] == 1) {
                grid[cur[0]][cur[1] + 1] = 2;
                deque.offerFirst(new int[]{cur[0], cur[1] + 1});
            }
            len--;
            if (len == 0){
                ans++;
                len = deque.size();
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return ans;
    }
}
