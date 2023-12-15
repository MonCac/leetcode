package storm.arraysandstrings.level1;

// 矩阵对角线元素的和

/*
给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。

请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
 */
public class No1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for (int i = 0; i < len; i++) {
            sum += mat[i][i];
            sum += mat[i][len - i - 1];
        }
        if (len % 2 != 0) {
            sum -= mat[len / 2][len / 2];
        }
        return sum;
    }
}
