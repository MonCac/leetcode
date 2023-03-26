package study_plan_algorithm_Introductory;

// 有序数组的平方

public class day_02_0977 {
    public static void main(String[] args){
        int[] arr = new int[]{-4,-1,0,3,10};
        sortedSquares(arr);
    }
    public static int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int flag = -1;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] >= 0){
                flag = i;
                break;
            }
        }
        if (flag == -1){
            for (int i = 0; i < nums.length; i++){
                ans[i] = nums[nums.length - i - 1] * nums[nums.length - i - 1];
            }
        }
        if (flag == 0){
            for (int i = 0; i < nums.length; i++){
                ans[i] = nums[i] * nums[i];
            }
        }
        else{
            int left = flag - 1, right = flag;
            for (int i = 0; i < nums.length; i++){
                if (left >= 0 && right < nums.length){
                    if (nums[left] * nums[left] > nums[right] * nums[right]){
                        ans[i] = nums[right] * nums[right];
                        right++;
                    }else{
                        ans[i] = nums[left] * nums[left];
                        left--;
                    }
                    continue;
                }
                if (left < 0){
                    ans[i] = nums[right] * nums[right];
                    right++;
                    continue;
                }
                if(right >= nums.length){
                    ans[i] = nums[left] * nums[left];
                    left--;
                }
            }
        }
        return ans;
    }
}
