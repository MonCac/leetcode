package lanqiao_sprint;
import java.util.Scanner;

public class Day02_001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int month = scan.nextInt();
        int day = scan.nextInt();
        scan.close();
        if (month > days.length) {
            System.out.println("no");
            return;
        }
        if (days[month - 1] >= day){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
