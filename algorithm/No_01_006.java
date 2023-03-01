package algorithm;

// 剑指Offer 30. 包含min函数的栈

import java.util.Stack;

public class No_01_006 {
    Stack<Integer> A,B;

    /** initialize your data structure here. */
    public No_01_006() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        if (B.isEmpty() || B.peek() >= x){
            B.add(x);
        }
    }

    public void pop() {
        if (A.pop().equals(B.peek())){
            B.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}
