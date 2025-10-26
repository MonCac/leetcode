package hot100.matrix;

public class No_48 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[] index = new int[n];
        for (int i = 0; i < n / 2; i++){
            for(int l = 0; l < n - i - 1; l++){
                index[l] = matrix[n - i - 1 - l][i];
            }
            int j = i;
            int m = 0;
            while ( j < n - i - 1){
                int temp = matrix[i][j];
                matrix[i][j] = index[m];
                index[m] = temp;
                m++;
                j++;
            }
            m = 0;
            int k = i;
            while (k < n - i - 1){
                int temp = matrix[k][j];
                matrix[k][j] = index[m];
                index[m] = temp;
                k++;
                m++;
            }
            m = 0;
            while(j > i){
                int temp = matrix[k][j];
                matrix[k][j] = index[m];
                index[m] = temp;
                m++;
                j--;
            }
            m = 0;
            while (k > i){
                matrix[k][j] = index[m];
                m++;
                k--;
            }
        }
    }
}
