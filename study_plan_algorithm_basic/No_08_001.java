package study_plan_algorithm_basic;

// 1091. 二进制矩阵中的最短路径

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class No_08_001 {
    public static void main(String[] args){
        int[][] grid = new int[2][2];
        grid[0] = new int[]{0,1};
        grid[1] = new int[]{1,0};
        shortestPathBinaryMatrix(grid);

    }
    public static int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1){
            return -1;
        }
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(a[i],Integer.MAX_VALUE);
        }
        Queue<int[]> queue = new LinkedList<>();
        a[0][0] = 1;
        queue.add(new int[]{0,0});
        while (!queue.isEmpty()){
            int[] b = queue.poll();
            int num = a[b[0]][b[1]];
            int nextnum = num + 1;
            // 进行八个方向的判断,顺序是：上、下、左、右、左上、右上、左下、右下
            if (b[0] > 0 && grid[b[0] - 1][b[1]] == 0 && nextnum < a[b[0] - 1][b[1]]) {
                queue.add(new int[]{b[0] - 1,b[1]});
                a[b[0] - 1][b[1]] = nextnum;
            }
            if (b[0] < n - 1 && grid[b[0] + 1][b[1]] == 0 && nextnum < a[b[0] + 1][b[1]]) {
                queue.add(new int[]{b[0] + 1,b[1]});
                a[b[0] + 1][b[1]] = nextnum;
            }
            if (b[1] > 0 && grid[b[0]][b[1] - 1] == 0 && nextnum < a[b[0]][b[1] - 1]) {
                queue.add(new int[]{b[0],b[1] - 1});
                a[b[0]][b[1] - 1] = nextnum;
            }
            if (b[1] < n - 1 && grid[b[0]][b[1] + 1] == 0 && nextnum < a[b[0]][b[1] + 1]) {
                queue.add(new int[]{b[0],b[1] + 1});
                a[b[0]][b[1] + 1] = nextnum;
            }
            if (b[0] > 0 && b[1] > 0 && grid[b[0] - 1][b[1] - 1] == 0 && nextnum < a[b[0] - 1][b[1] - 1]) {
                queue.add(new int[]{b[0] - 1,b[1] - 1});
                a[b[0] - 1][b[1] - 1] = nextnum;
            }
            if (b[0] > 0 && b[1] < n - 1 && grid[b[0] - 1][b[1] + 1] == 0 && nextnum < a[b[0] - 1][b[1] + 1]) {
                queue.add(new int[]{b[0] - 1,b[1] + 1});
                a[b[0] - 1][b[1] + 1] = nextnum;
            }
            if (b[0] < n - 1 && b[1] > 0 && grid[b[0] + 1][b[1] - 1] == 0 && nextnum < a[b[0] + 1][b[1] - 1]) {
                queue.add(new int[]{b[0] + 1,b[1] - 1});
                a[b[0] + 1][b[1] - 1] = nextnum;
            }
            if (b[0] < n - 1 && b[1] < n - 1 && grid[b[0] + 1][b[1] + 1] == 0 && nextnum < a[b[0] + 1][b[1] + 1]) {
                queue.add(new int[]{b[0] + 1,b[1] + 1});
                a[b[0] + 1][b[1] + 1] = nextnum;
            }
        }
        return a[n - 1][n - 1] == Integer.MAX_VALUE ? -1 : a[n - 1][n - 1];
    }
}
