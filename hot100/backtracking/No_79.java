package hot100.backtracking;

public class No_79 {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'Z', 'Z', 'Z', 'Z', 'Z'},
                {'Z', 'C', 'B', 'A', 'B'},
                {'A', 'D', 'E', 'D', 'C'},
                {'B', 'E', 'Z', 'Z', 'Z'},
        };
        exist(board, "ABEDCBA");
    }
    static StringBuffer sb = new StringBuffer();
    public static boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        int[][] flag = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == chars[0]) {
                    if (word.length() > 1) {
                        sb.append(board[i][j]);
                        flag[i][j] = 1;
                        if (i > 0) {
                            if (backTracking(board, chars, 1, i - 1, j, flag)){
                                return true;
                            }
                        }
                        if (i < board.length - 1) {
                            if (backTracking(board, chars, 1, i + 1, j, flag)){
                                return true;
                            }
                        }
                        if (j > 0) {
                            if (backTracking(board, chars, 1, i, j - 1, flag)) {
                                return true;
                            }
                        }
                        if (j < board[0].length - 1) {
                            if (backTracking(board, chars, 1, i, j + 1, flag)){
                                return true;
                            }
                        }
                        sb.deleteCharAt(sb.length() - 1);
                        flag[i][j] = 0;
                    }else{
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean backTracking(char[][]board, char[] chars, int start, int row, int col, int[][] flag) {
        if (start == chars.length) {
            return sb.toString().equals(new String(chars));
        }
        if (board[row][col] != chars[start]) {
            return false;
        }
        sb.append(board[row][col]);
        flag[row][col] = 1;
        if (sb.toString().equals(new String(chars))) {
            return true;
        }
        if (row > 0 && flag[row - 1][col] != 1) {
            if (backTracking(board, chars, start + 1, row - 1, col, flag)){
                return true;
            }
        }
        if (row < board.length - 1 && flag[row + 1][col] != 1) {
            if (backTracking(board, chars, start + 1, row + 1, col, flag)){
                return true;
            }
        }
        if (col > 0 && flag[row][col - 1] != 1) {
            if (backTracking(board, chars, start + 1, row, col - 1, flag)) {
                return true;
            }
        }
        if (col < board[0].length - 1 && flag[row][col + 1] != 1) {
            if(backTracking(board, chars, start + 1, row, col + 1, flag)){
                return true;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        flag[row][col] = 0;
        return false;
    }
}
