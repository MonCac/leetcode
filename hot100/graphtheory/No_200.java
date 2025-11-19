package hot100.graphtheory;

import java.util.Stack;

public class No_200 {
    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        grid[0] = new char[]{'1', '1', '1'};
        grid[1] = new char[]{'0', '1', '0'};
        grid[2] = new char[]{'1', '1', '1'};
        numIslands(grid);
    }
    public static int numIslands(char[][] grid) {
        Stack<int[]> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    stack.push(new int[]{i, j});
                    ans++;
                    grid[i][j] = '0';
                }
                while(!stack.isEmpty()){
                    int[] cur = stack.pop();
                    if (cur[0] - 1 >= 0 && grid[cur[0] - 1][cur[1]] == '1'){
                        grid[cur[0] - 1][cur[1]] = '0';
                        stack.push(new int[]{cur[0] - 1, cur[1]});
                    }
                    if (cur[1] - 1 >= 0 && grid[cur[0]][cur[1] - 1] == '1'){
                        grid[cur[0]][cur[1] - 1] = '0';
                        stack.push(new int[]{cur[0], cur[1] - 1});
                    }
                    if (cur[0] + 1 < grid.length && grid[cur[0] + 1][cur[1]] == '1'){
                        grid[cur[0] + 1][cur[1]] = '0';
                        stack.push(new int[]{cur[0] + 1, cur[1]});
                    }
                    if (cur[1] + 1 < grid[0].length && grid[cur[0]][cur[1] + 1] == '1'){
                        grid[cur[0]][cur[1] + 1] = '0';
                        stack.push(new int[]{cur[0], cur[1] + 1});
                    }
                }
            }
        }
        return ans;
    }
}
