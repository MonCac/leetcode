package algorithm;

// 剑指Offer 09. 用两个栈实现队列

import java.util.Stack;

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */

class No_01_003 {
    Stack<Integer> A;
    Stack<Integer> B;

    public No_01_003() {
        A = new Stack<Integer>();
        B = new Stack<Integer>();
    }

    public void appendTail(int value) {
        A.push(value);
    }

    public int deleteHead() {
        while (!A.empty()) {
            B.push(A.pop());
        }
        int result = B.empty() ? -1 : B.pop();
        while (!B.empty()) {
            A.push(B.pop());
        }
        return result;
    }
}

