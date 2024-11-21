package programmercarl.array;

// 螺旋矩阵II

public class No59 {
    public static void main(String[] args) {
        generateMatrix(3);
    }

    public static int[][] generateMatrix(int n) {
        int num = 1;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            // 右
            for (int j = 0; j < n - 1 - 2 * i; j++) {
                matrix[i][i + j] = num;
                num++;
            }
            // 下
            for (int j = 0; j < n - 1 - 2 * i; j++) {
                matrix[i + j][n - 1 - i] = num;
                num++;
            }
            // 左
            for (int j = 0; j < n - 1 - 2 * i; j++) {
                matrix[n - 1 - i][n - 1 - i - j] = num;
                num++;
            }
            // 上
            for (int j = 0; j < n - 1 - 2 * i; j++) {
                matrix[n - 1 - i - j][i] = num;
                num++;
            }
        }
        if (num == n * n){
            matrix[n / 2][n / 2] = num;
        }
        return matrix;
    }
}
