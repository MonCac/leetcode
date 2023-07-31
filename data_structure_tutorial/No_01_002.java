package data_structure_tutorial;

// 加一

public class No_01_002 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--){
            if (digits[i] != 9){
                break;
            }
            if(i == 0){
                len++;
            }
        }
        int[] ans = new int[len];
        if (len != digits.length){
            ans[0] = 1;
            return ans;
        }
        int index = 1;
        for (int i = digits.length - 1; i >= 0; i--){
            if (index == 1 && digits[i] == 9){
                ans[i] = 0;
            }else{
                ans[i] = digits[i] + index;
                index = 0;
            }
        }
        return ans;
    }
}
