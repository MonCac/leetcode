package study_plan_algorithm;

// 图像渲染

import java.util.Stack;

public class day_07_0733 {
    public static void main(String[] args){
        int[][] image = new int[3][3];
        image[0] = new int[]{1,1,1};
        image[1] = new int[]{1,1,0};
        image[2] = new int[]{1,0,1};
        floodFill(image,1,1,2);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] fill = new boolean[image.length][image[0].length];
        int num = image[sr][sc];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++){
                fill[i][j] = true;
            }
        }
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{sr, sc});
        while (!stack.empty()){
            int[] a = stack.pop();
            fill[a[0]][a[1]] = false;
            image[a[0]][a[1]] = color;
            if (a[0] - 1 >= 0 && fill[a[0] - 1][a[1]] && image[a[0] - 1][a[1]] == num){
                stack.push(new int[]{a[0] - 1, a[1]});
            }
            if (a[0] + 1 <image.length && fill[a[0] + 1][a[1]] && image[a[0] + 1][a[1]] == num){
                stack.push(new int[]{a[0] + 1, a[1]});
            }
            if (a[1] - 1 >= 0 && fill[a[0]][a[1] - 1] && image[a[0]][a[1] - 1] == num){
                stack.push(new int[]{a[0], a[1] - 1});
            }
            if (a[1] + 1 < image[0].length && fill[a[0]][a[1] + 1] && image[a[0]][a[1] + 1] == num){
                stack.push(new int[]{a[0], a[1] + 1});
            }
        }
        return image;
    }
}
