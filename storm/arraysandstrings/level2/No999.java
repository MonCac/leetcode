package storm.arraysandstrings.level2;

// 可以被一步捕获的棋子数

/*
在一个 8 x 8 的棋盘上，有一个白色的车（Rook），用字符 'R' 表示。棋盘上还可能存在空方块，白色的象（Bishop）以及黑色的卒（pawn），分别用字符 '.'，'B' 和 'p' 表示。不难看出，大写字符表示的是白棋，小写字符表示的是黑棋。

车按国际象棋中的规则移动。东，西，南，北四个基本方向任选其一，然后一直向选定的方向移动，直到满足下列四个条件之一：

棋手选择主动停下来。
棋子因到达棋盘的边缘而停下。
棋子移动到某一方格来捕获位于该方格上敌方（黑色）的卒，停在该方格内。
车不能进入/越过已经放有其他友方棋子（白色的象）的方格，停在友方棋子前。
你现在可以控制车移动一次，请你统计有多少敌方的卒处于你的捕获范围内（即，可以被一步捕获的棋子数）。
 */


// 笨方法
//public class No999 {
//    public int numRookCaptures(char[][] board) {
//        int ans = 0;
//        int[] R = getRookCaptures(board);
//        if (R == null) {
//            return ans;
//        }
//        int x = R[0], y = R[1];
//        for (int i = x + 1; i < 8; i++) {
//            if (board[i][y] == 'p') {
//                ans++;
//                break;
//            }
//            if (board[i][y] == 'B') {
//                break;
//            }
//        }
//        for (int i = x - 1; i > -1; i--) {
//            if (board[i][y] == 'p') {
//                ans++;
//                break;
//            }
//            if (board[i][y] == 'B') {
//                break;
//            }
//        }
//        for (int i = y + 1; i < 8; i++) {
//            if (board[x][i] == 'p') {
//                ans++;
//                break;
//            }
//            if (board[x][i] == 'B') {
//                break;
//            }
//        }
//        for (int i = y - 1; i > -1; i--) {
//            if (board[x][i] == 'p') {
//                ans++;
//                break;
//            }
//            if (board[x][i] == 'B') {
//                break;
//            }
//        }
//        return ans;
//
//    }
//
//
//    public int[] getRookCaptures(char[][] board) {
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++){
//                if (board[i][j] == 'R'){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }
//}
//


// 使用方法数组，可以优化4个for变为两个for的嵌套
public class No999 {
    public int numRookCaptures(char[][] board) {
        int cnt = 0, st = 0, ed = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (board[i][j] == 'R') {
                    st = i;
                    ed = j;
                    break;
                }
            }
        }
        for (int i = 0; i < 4; ++i) {
            for (int step = 0; ; ++step) {
                int tx = st + step * dx[i];
                int ty = ed + step * dy[i];
                if (tx < 0 || tx >= 8 || ty < 0 || ty >= 8 || board[tx][ty] == 'B') {
                    break;
                }
                if (board[tx][ty] == 'p') {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}