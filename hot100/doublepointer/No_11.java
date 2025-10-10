package hot100.doublepointer;

public class No_11 {
    public int maxArea(int[] height) {
        int end = height.length - 1;
        int start = 0;
        int max = 0;
        while (end >= start){
            max = Math.max(max, Math.min(height[end], height[start]) * (end - start));
            if (height[end] < height[start]){
                end--;
            }else{
                start++;
            }
        }
        return max;
    }
}
