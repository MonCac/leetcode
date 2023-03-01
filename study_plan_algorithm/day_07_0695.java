package study_plan_algorithm;

// 岛屿的最大面积

import java.util.Stack;

public class day_07_0695 {
    public static void main(String[] args){
        int[][] grid = new int[8][13];
        grid[0] = new int[]{0,0,1,0,0,0,0,1,0,0,0,0,0};
        grid[1] = new int[]{0,0,0,0,0,0,0,1,1,1,0,0,0};
        grid[2] = new int[]{0,1,1,0,1,0,0,0,0,0,0,0,0};
        grid[3] = new int[]{0,1,0,0,1,1,0,0,1,0,1,0,0};
        grid[4] = new int[]{0,1,0,0,1,1,0,0,1,1,1,0,0};
        grid[5] = new int[]{0,0,0,0,0,0,0,0,0,0,1,0,0};
        grid[6] = new int[]{0,0,0,0,0,0,0,1,1,1,0,0,0};
        grid[7] = new int[]{0,0,0,0,0,0,0,1,1,0,0,0,0};
        maxAreaOfIsland(grid);
    }
    public static int maxAreaOfIsland(int[][] grid) {
        int[] x = new int[]{-1,1,0,0};
        int[] y = new int[]{0,0,-1,1};
        int ans = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1){
                    ans = Math.max(ans,bfs(grid,i,j,x,y));
                }
            }
        }
        return ans;
    }

    public static int bfs(int[][] grid,int i ,int j,int[] x,int[] y){
        grid[i][j] = 2;
        int ans = 1;
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i,j});
        while (!stack.empty()){
            int[] cur = stack.pop();
            for (int k = 0; k < x.length; k++){
                if (cur[0] + x[k] >= 0 && cur[0] + x[k] < grid.length){
                    if (cur[1] + y[k] >= 0 && cur[1] + y[k] < grid[0].length){
                        if (grid[cur[0] + x[k]][cur[1] + y[k]] == 1){
                            stack.push(new int[]{cur[0] + x[k],cur[1] + y[k]});
                            grid[cur[0] + x[k]][cur[1] + y[k]] = 2;
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
