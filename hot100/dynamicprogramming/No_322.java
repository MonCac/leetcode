package hot100.dynamicprogramming;

import java.util.Arrays;
import java.util.function.ToIntFunction;

public class No_322 {
    public static void main(String[] args){
        coinChange(new int[]{186,419,83,408}, 6249);
    }
    public static int coinChange(int[] coins, int amount) {
        int[] f = new int[amount + 1];
        Arrays.sort(coins);
        for (int i = 1; i <= amount; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length && i >= coins[j]; j++){
                if (f[i - coins[j]] == -1){
                    continue;
                }
                min = Math.min(min, f[i - coins[j]]);
            }
            if (min == Integer.MAX_VALUE){
                f[i] = -1;
            }else{
                f[i] = min + 1;
            }

        }
        return f[amount];
    }
}
