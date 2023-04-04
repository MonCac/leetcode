package study_plan_algorithm_basic;

// 130. 被围绕的区域

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class No_08_002 {
    public static void main(String[] args){
        char[][] board = new char[4][6];
        board[0] = new char[]{'X','O','X','O','X','O'};
        board[1] = new char[]{'O','X','O','X','O','X'};
        board[2] = new char[]{'X','O','X','O','X','O'};
        board[3] = new char[]{'O','X','O','X','O','X'};
        solve(board);
    }
    public static void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        Boolean[][] isO = new Boolean[m][n];
        for (int i = 0; i < m; i++){
            Arrays.fill(isO[i],false);
        }
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            int j = 0,k = n - 1;
            if (board[i][j] == 'O'){
                queue.add(new int[]{i,j});
                isO[i][j] = true;
            }
            if (board[i][k] == 'O' && !isO[i][k]) {
                queue.add(new int[]{i, k});
                isO[i][k] = true;
            }
        }
        for (int i = 0; i < n; i++){
            int j = 0, k = m - 1;
            if (board[j][i] == 'O' && !isO[j][i]){
                queue.add(new int[]{j,i});
                isO[j][i] = true;
            }
            if (board[k][i] == 'O' && !isO[k][i]){
                queue.add(new int[]{k,i});
                isO[k][i] = true;
            }
        }
        while (!queue.isEmpty()){
            int[] a = queue.poll();
            // 判断顺序为上、下、左、右
            if (a[0] > 0 && board[a[0] - 1][a[1]] == 'O' && !isO[a[0] - 1][a[1]]){
                queue.add(new int[]{a[0] - 1,a[1]});
                isO[a[0] - 1][a[1]] = true;
            }
            if (a[0] < m - 1 && board[a[0] + 1][a[1]] == 'O' && !isO[a[0] + 1][a[1]]){
                queue.add(new int[]{a[0] + 1,a[1]});
                isO[a[0] + 1][a[1]] = true;
            }
            if (a[1] > 0 && board[a[0]][a[1] - 1] == 'O' && !isO[a[0]][a[1] - 1]){
                queue.add(new int[]{a[0],a[1] - 1});
                isO[a[0]][a[1] - 1] = true;
            }
            if (a[1] < n - 1 && board[a[0]][a[1] + 1] == 'O' && !isO[a[0]][a[1] + 1]){
                queue.add(new int[]{a[0],a[1] + 1});
                isO[a[0]][a[1] + 1] = true;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                if (!isO[i][j] && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
}
