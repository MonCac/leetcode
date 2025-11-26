package hot100.binarysearch;

public class No_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int colLen = matrix.length, rowLen = matrix[0].length;
        int left = 0, right = colLen * rowLen - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int num = matrix[mid / rowLen][mid % rowLen];
            if (num == target){
                return true;
            }
            if (num > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }
}
