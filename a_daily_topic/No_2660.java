package a_daily_topic;

// 保龄球游戏的获胜者
public class No_2660 {
    public static void main(String[] args){
        int[] a = new int[]{0,4,7,2,0};
        int[] b = new int[]{2,3,3,0,1};
        isWinner(a,b);
    }
    public static int isWinner(int[] player1, int[] player2) {
        int flag1 = 0, flag2 = 0;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < player1.length; i++){
            if (flag1 > 0) {
                sum1 += player1[i] * 2;
                flag1--;
            }else{
                sum1 += player1[i];
            }
            if (flag2 > 0) {
                sum2 += player2[i] * 2;
                flag2--;
            }else{
                sum2 += player2[i];
            }
            if (player1[i] == 10) {
                flag1 = 2;
            }
            if (player2[i] == 10) {
                flag2 = 2;
            }
        }
        if (sum1 > sum2) {
            return 1;
        } else if (sum1 < sum2) {
            return 2;
        } else {
            return 0;
        }
    }
}
