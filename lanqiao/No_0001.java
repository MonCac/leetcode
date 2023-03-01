package lanqiao;
import java.util.Scanner;

// 单词分析

public class No_0001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] max = new int[2];
        max[0] = -1;
        max[1] = Integer.MIN_VALUE;
        int[] num = new int[26];
        String str = scan.nextLine();
        int a = -1;
        for (int i = 0; i < str.length(); i++){
            a = str.charAt(i) - 'a';
            num[a]++;
            if (max[1] <= num[a]){
                max[0] = a;
                max[1] = num[a];
            }
        }
        char m = (char) ('a' + max[0]);
        System.out.println(m);
        System.out.print(max[1]);

        scan.close();
    }
}
