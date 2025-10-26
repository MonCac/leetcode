package hot100.matrix;

import java.util.ArrayList;
import java.util.List;

public class No_54 {
    public static void main(String[] args){
        int[][] matrix = new int[3][5];
        matrix[0] = new int[]{1,2,3,4,5};
        matrix[1] = new int[]{6,7,8,9,10};
        matrix[2] = new int[]{11,12,13,14,15};
        spiralOrder(matrix);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        uo: for (int i = 0; i <= n / 2; i++){
            int j = i;
            while (j < n - i - 1) {
                if (ans.size() == m * n){
                    break uo;
                }
                ans.add(matrix[i][j]);
                j++;
            }
            int k = i;
            while ( k < m - i - 1){
                if (ans.size() == m * n){
                    break uo;
                }
                ans.add(matrix[k][j]);
                k++;
            }
            while( j > i){
                if (ans.size() == m * n){
                    break uo;
                }
                ans.add(matrix[k][j]);
                j--;
            }
            while ( k > i){
                if (ans.size() == m * n){
                    break uo;
                }
                ans.add(matrix[k][j]);
                k--;
            }
        }
        if (ans.size() < m * n){
            ans.add(matrix[m / 2][n / 2]);
        }
        return ans;
    }
}
