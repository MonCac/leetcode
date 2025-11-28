package hot100.stack;

import java.util.Stack;

public class No_394 {
    public static void main(String[] args){
        decodeString("100[leetcode]");
    }
    public static String decodeString(String s) {
        StringBuffer ans = new StringBuffer();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (c >= '0' && c <= '9' ){
                Stack<Character> stack = new Stack<>();
                stack.push(c);
                while (!stack.isEmpty()){
                    i++;
                    char c1 = chars[i];
                    if (c1 != ']'){
                        stack.push(c1);
                    }else{
                        StringBuffer sb = new StringBuffer();
                        while (stack.peek() != '['){
                            char c2 = stack.pop();
                            sb.insert(0, c2);
                        }
                        stack.pop();
                        int num = 0;
                        int flag = 1;
                        while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9'){
                            num = num + (stack.pop() - '0')  * flag;
                            flag += 10;
                        }
                        if (!stack.isEmpty()){
                            while (num > 0){
                                char[] char1 = sb.toString().toCharArray();
                                for (char c2 : char1){
                                    stack.push(c2);
                                }
                                num--;
                            }
                        }{
                            while (num > 0){
                                ans.append(sb);
                                num--;
                            }
                        }
                    }
                }
            }else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
