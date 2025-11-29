package hot100.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

public class No_84_1 {
    public static void main(String[] args){
        largestRectangleArea(new int[]{2,4});
    }
    public static int largestRectangleArea(int[] heights) {
        int ans = 0;
        for(int i = 0; i < heights.length; i++){
            int height = heights[i];
            int left = i, right = i;
            while (left > -1 && heights[left] >= height){
                left--;
            }
            while (right < heights.length && heights[right] >= height){
                right++;
            }
            ans = Math.max(ans, height * (right - left - 1));
        }
        return ans;
    }
}
