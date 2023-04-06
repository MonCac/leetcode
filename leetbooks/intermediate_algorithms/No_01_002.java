package leetbooks.intermediate_algorithms;

// 矩阵置零

public class No_01_002 {
    public void setZeroes(int[][] matrix) {
        //标记第一行是否有数字0
        boolean row = false;
        //标记第一列是否有数字0
        boolean col = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    //如果第一行或者第一列本来就有0，就把他标记一
                    //下，最后再把第一行或者第一列全部置为0
                    if (i == 0) {
                        row = true;
                    }
                    if (j == 0) {
                        col = true;
                    }
                    //把最上面一行和最左边一列对应的位置标注为0
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }
        //把那些应该为0的行和列全部置为0
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        //如果第一列本来就有0，把第一列全部变为0
        if (col) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        //如果第一行本来就有0，把第一行全部变为0
        if (row) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
