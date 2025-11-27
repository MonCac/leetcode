package hot100.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class No_20 {
    public static void main(String[] args) {
        isValid("(])");
    }
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            }else{
                if (stack.isEmpty()) {
                    return false;
                }
                if (chars[i] == ')' && stack.peek() == '(') {
                    stack.pop();
                    continue;
                }
                if (chars[i] == '}' && stack.peek() == '{') {
                    stack.pop();
                    continue;
                }
                if (chars[i] == ']' && stack.peek() == '[') {
                    stack.pop();
                    continue;
                }
                return false;
            }
        }
        return stack.isEmpty();
    }
}
