package lanqiao_sprint;
import java.util.Scanner;


public class Day02_003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++){
            String str = scan.next();
            for (int j = 0; j < m; j++){
                if (str.charAt(j) == '0'){
                    matrix[i][j] = 0;
                }else{
                    matrix[i][j] = 1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix[i][j] == 1){
                    ans++;
                    matrix = dfs(i,j,matrix);
                }
            }
        }
        System.out.println(ans);
        scan.close();
    }

    public static int[][] dfs(int p, int q, int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        while ((p < n || q < m) && matrix[p][q] >= 1){
            if (matrix[p][q] >= 1){
                matrix[p][q]++;
            }
            if (p + 1 < n && matrix[p + 1][q] == 1){
                p++;
            }else if (q + 1 < m && matrix[p][q + 1] == 1){
                q++;
            }else if(p + 1 < n && matrix[p + 1][q] > 1){
                p++;
            }else if (q + 1 < m && matrix[p][q + 1] > 1) {
                q++;
            }else{
                break;
            }
        }
        return matrix;
    }
}
