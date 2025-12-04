package hot100.dynamicprogramming;

public class No_279_2 {
    public int numSquares(int n) {
        if (isPerfectSquare(n)){
            return 1;
        }
        if (checkAnswer4(n)){
            return 4;
        }
        for (int i = 1; i * i < n; i++){
            int m = n - i * i;
            if (isPerfectSquare(m)){
                return 2;
            }
        }
        return 3;
    }
    public boolean isPerfectSquare(int n){
        int m = (int)Math.sqrt(n);
        return m * m == n;
    }
    public boolean checkAnswer4(int n){
        while (n % 4 == 0){
            n /= 4;
        }
        return n % 8 == 7;
    }
}
