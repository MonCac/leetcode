package programmercarl.greedy;

// 406 根据身高重建队列

import java.util.Arrays;

public class No406 {
    public static void main(String []args){
        int[][] a = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        reconstructQueue(a);
    }
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] ans = new int[people.length][people[0].length];
        for (int i = 0; i < people.length; i++){
            int sum = 0;
            int index = people[i][1];
            for (int j = 0; j < i; j++){
                if (ans[j][0] != 0 && ans[j][0] < people[i][0]){
                    sum++;
                }
            }
            ans[sum + index] = people[i];
        }

        for (int[] row : ans){
            System.out.println(Arrays.toString(row));
        }
        return ans;

    }
}
