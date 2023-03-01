package algorithm;

// 剑指Offer 59 - II. 队列的最大值

import java.util.*;

public class No_01_010 {
    Queue<Integer> queue;
    Deque<Integer> deque;
    public No_01_010() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int max_value() {
        return deque.isEmpty() ? -1 : deque.peekFirst();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!deque.isEmpty() && deque.peekLast() < value){
            deque.pollLast();
        }
        deque.offerLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()){
            return -1;
        }
        if (queue.peek().equals(deque.peekFirst())){
            deque.pollFirst();
        }
        return queue.poll();
    }
}
