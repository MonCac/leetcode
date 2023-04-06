package lanqiaobisai;

import java.util.*;

public class No_009 {
    public static List<List<Integer>> result = new ArrayList<List<Integer>>();
    public static LinkedList<Integer> path = new LinkedList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] power = new int[m];
        for (int i = 0; i < m; i++){
            power[i] = sc.nextInt();
        }
        backTrace(m,n,0);
        System.out.println(result.size());
    }
    public static void backTrace(int m, int n,int num){
        if (num > n){
            return;
        }
        if (num == n){
            result.add(new ArrayList<>(path));
            return;
        }
        if (path.size() == m){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 1; i <= n; i++){
            num += i;
            path.add(i);
            backTrace(m,n,num);
            num -= i;
            path.removeLast();
        }

    }
}
