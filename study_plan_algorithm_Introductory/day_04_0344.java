package study_plan_algorithm_Introductory;

// 反转字符串

public class day_04_0344 {
    public void reverseString(char[] s) {
        if (s.length == 1){
            return;
        }
        int left = 0, right = s.length - 1;
        while (left < right){
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
            right--;
        }
    }
}
