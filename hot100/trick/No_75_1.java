package hot100.trick;

public class No_75_1 {
    public void sortColors(int[] nums) {
        int red = 0, white = 0, blue = 0;
        for (int num: nums){
            if (num == 0){
                red++;
            }else if(num == 1){
                white++;
            }else{
                blue++;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (red != 0){
                red--;
                nums[i] = 0;
            } else if (white != 0) {
                white--;
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }
    }
}
