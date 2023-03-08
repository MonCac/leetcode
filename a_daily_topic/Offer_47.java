package a_daily_topic;

// 剑指 Offer 47. 礼物的最大价值

public class Offer_47 {
    public static void main(String args[]){
        int[][] grid = new int[3][3];
        grid[0] = new int[]{1,3,1};
        grid[1] = new int[]{1,5,1};
        grid[2] = new int[]{4,2,1};
        maxValue(grid);
    }
    public static int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                if (i != 0){
                    if (j != 0){
                        grid[i][j] = grid[i][j] + Math.max(grid[i-1][j],grid[i][j-1]);
                    }else {
                        grid[i][j] = grid[i][j] + grid[i - 1][j];
                    }
                }else{
                    if (j != 0){
                        grid[i][j] = grid[i][j] + grid[i][j-1];
                    }
                }
            }
        }
        return grid[m-1][n-1];
    }
}
