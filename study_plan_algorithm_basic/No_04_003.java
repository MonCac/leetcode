package study_plan_algorithm_basic;

// 11. 盛水最多的容器

public class No_04_003 {
    public int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int left = 0, right = height.length - 1;
        while (left < right){
            int length = right - left;
            ans = Math.max(ans, length * (Math.min(height[left], height[right])));
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
