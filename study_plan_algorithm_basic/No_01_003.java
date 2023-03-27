package study_plan_algorithm_basic;

// 74. 搜索二维矩阵

public class No_01_003 {
    public static void main(String[] args){
        int[][] matrix = new int[1][1];
        matrix[0] = new int[]{1};
        searchMatrix(matrix,2);

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length * matrix[0].length;
        int left = 0, right = n - 1;
        int leftNumber = searchNumber(matrix,left);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midNumber = searchNumber(matrix, mid);
            leftNumber = searchNumber(matrix, left);
            if (midNumber < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        leftNumber = searchNumber(matrix, left);
        if (leftNumber == target){
            return true;
        }
        return false;
    }

    public static int searchNumber(int[][] matrix, int number){
        int m = number / matrix[0].length;
        int n = number % matrix[0].length;
        return matrix[m][n];
    }
}
