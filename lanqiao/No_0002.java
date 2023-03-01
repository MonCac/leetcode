package lanqiao;

import java.util.Scanner;

// 成绩统计

public class No_0002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jige = 0;
        int youxiu = 0;
        int sum = scan.nextInt();
        int b = 0;
        for (int i = 0; i < sum; i++){
            b = scan.nextInt();
            if (b >= 60){
                jige++;
                if (b >= 85){
                    youxiu++;
                }
            }
        }
        System.out.println(Math.round(100 * jige / sum) + "%");
        System.out.println(Math.round(100 * youxiu / sum) + "%");
        scan.close();
    }
}
