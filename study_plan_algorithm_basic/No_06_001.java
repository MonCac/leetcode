package study_plan_algorithm_basic;

// 200. 岛屿数量

import java.util.LinkedList;
import java.util.Queue;

public class No_06_001 {
    public static void main(String[] args){
        char[][] grid = new char[3][4];
        grid[0] = new char[]{'1','1','1'};
        grid[1] = new char[]{'0','1','0'};
        grid[2] = new char[]{'1','1','1'};
        numIslands(grid);
    }
    public static int numIslands(char[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                if (grid[i][j] == '1'){
                    ans++;
                    grid[i][j] = '0';
                    queue.add(new int[]{i, j});
                    while (!queue.isEmpty()){
                        int[] a = queue.poll();
                        if (a[0] - 1 >= 0 && grid[a[0] - 1][a[1]] == '1'){
                            grid[a[0] - 1][a[1]] = '0';
                            queue.add(new int[]{a[0] - 1,a[1]});
                        }
                        if (a[1] - 1 >= 0 && grid[a[0]][a[1] - 1] == '1'){
                            grid[a[0]][a[1] - 1] = '0';
                            queue.add(new int[]{a[0],a[1] - 1});
                        }
                        if (a[0] + 1 < m && grid[a[0] + 1][a[1]] == '1'){
                            grid[a[0] + 1][a[1]] = '0';
                            queue.add(new int[]{a[0] + 1,a[1]});
                        }
                        if (a[1] + 1 < n && grid[a[0]][a[1] + 1] == '1'){
                            grid[a[0]][a[1] + 1] = '0';
                            queue.add(new int[]{a[0],a[1] + 1});
                        }
                    }
                }
            }
        }
        return ans;
    }
}
