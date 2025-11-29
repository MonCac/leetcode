package hot100.stack;

import java.util.Stack;

public class No_84_2 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        stack.push(-1);
        for (int i = 0; i < heights.length; i++){
            if (stack.peek() == -1){
                stack.push(i);
            }else{
                while (stack.peek() > -1 && heights[i] <= heights[stack.peek()]){
                    int now = stack.pop();
                    int sum = (i - stack.peek() - 1) * heights[now];
                    ans = Math.max(ans, sum);
                }
                stack.push(i);
            }
        }
        while (stack.peek() != -1){
            ans = Math.max(ans, heights[stack.pop()] * (heights.length - stack.peek() - 1));
        }
        return ans;
    }
}
