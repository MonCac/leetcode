package hot100.normalarray;

public class No_189 {
    public static void main(String[] args){
        rotate(new int[]{1}, 0);
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        int change = 0;
        int n1 = nums.length;
        int n2 = k;
        int[] keys = new int[k];
        for (int i = 0; i < k; i++) {
            keys[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            if (k == 0){
                break;
            }
            n1 = (i + k) % nums.length;
            n2 = (i + k) % k;
            change = keys[n2];
            keys[n2] = nums[n1];
            nums[n1] = change;
        }
    }
}
