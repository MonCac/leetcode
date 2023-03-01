package lanqiao;

// 门牌制作

import java.util.Scanner;

public class No_0005 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2020; i++){
            int m = i;
            while (m != 0){
                if (m % 10 == 2){
                    count++;
                }
                m /= 10;
            }
        }
        System.out.println(count);
    }
}
