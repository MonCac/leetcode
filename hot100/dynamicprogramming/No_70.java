package hot100.dynamicprogramming;

public class No_70 {
    public int climbStairs(int n) {
        int ans = 0;
        int n1 = 1;
        if (n == 1){
            return n1;
        }
        int n2 = 2;
        if (n == 2){
            return n2;
        }
        for (int i = 3; i <= n; i++){
            if (i % 2 == 1){
                n1 += n2;
            }else{
                n2 += n1;
            }
        }
        return n % 2 == 1? n1 : n2;
    }
}
