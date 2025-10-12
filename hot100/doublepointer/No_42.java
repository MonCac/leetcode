package hot100.doublepointer;

public class No_42 {
    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0;
        int left = 0, right = height.length - 1;
        int ans = 0;
        if (height.length < 3){
            return ans;
        }
        while (left < right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]){
                ans += leftMax - height[left];
                left++;
            }else{
                ans += rightMax - height[right];
                right--;
            }
        }
        return ans;
    }
}
