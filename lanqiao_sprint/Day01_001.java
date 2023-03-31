package lanqiao_sprint;
import java.util.Scanner;

// 找素数

public class Day01_001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int left = scan.nextInt();
        int right = scan.nextInt();
        int ans = 0;
        for (int i = left; i <= right; i++){
            if (isSu(i)){
                ans++;
            }
        }
        System.out.println(ans);
        scan.close();
    }

    public static boolean isSu(int num){
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
