package algorithm;

// 剑指Offer 59 -I 滑动窗口的最大值

import java.util.Deque;
import java.util.LinkedList;

public class No_01_009 {
    public static void main(String[] args){
        int[] nums = new int[]{7,2,4};
        maxSlidingWindow(nums,2);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0){
            return new int[]{};
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        // 未形成窗口
        for (int i = 0; i < k; i++){
            while (!deque.isEmpty() && deque.peekLast() < nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res[0] = deque.peekFirst();
        // 形成窗口后
        for (int i = k; i < nums.length; i++){
            if (deque.peekFirst() == nums[i - k]){
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast() < nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;
    }
}
