package in_order;

public class No_0001 {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] res = new int[2];
        for(int i = 0;i < length - 1;i++)
            for(int j = i + 1;j < length;j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        return res;
    }
}
