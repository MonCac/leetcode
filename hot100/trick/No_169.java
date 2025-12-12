package hot100.trick;

public class No_169 {
    public static void main(String[] args){
        majorityElement(new int[]{1,1,1,2,2});
    }
    public static int majorityElement(int[] nums) {
        int ans = nums[0];
        int time = 0;
        for (int num : nums){
            if (ans == num){
                time++;
            }else{
                if (time == 0){
                    ans = num;
                }else{
                    time--;
                }
            }
        }
        return ans;
    }
}
