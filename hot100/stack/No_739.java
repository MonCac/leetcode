package hot100.stack;

import java.util.Stack;

public class No_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        out: for (int i = temperatures.length - 1; i > -1; i--){
            while (!stack.isEmpty()){
                int[] now = stack.peek();
                if (now[0] > temperatures[i]){
                    ans[i] = now[1] - i;
                    stack.push(new int[]{temperatures[i], i});
                    continue out;
                }else{
                    stack.pop();
                }
            }
            if (stack.isEmpty()){
                ans[i] = 0;
                stack.push(new int[]{temperatures[i], i});
            }
        }
        return ans;
    }
}
