package a_daily_topic;

// 积压订单中的订单总数

import java.util.PriorityQueue;

public class No_1801 {
    public int getNumberOfBacklogOrders(int[][] orders) {
        int ans = 0;
        PriorityQueue<Integer> buyQue = new PriorityQueue<>((a,b) -> orders[b][0] - orders[a][0]);
        PriorityQueue<Integer> sellQue = new PriorityQueue<>((a,b) -> orders[a][0] - orders[b][0]);
        for (int i = 0; i < orders.length; i++){
            int[] o = orders[i];
            int type = o[2], price = o[0];
            if (type == 0) {
                while (!sellQue.isEmpty() && o[1] > 0){
                    int[] q = orders[sellQue.peek()];
                    if (q[0] > price) {
                        break;
                    }
                    int min = Math.min(o[1] , q[1]);
                    o[1] -= min;
                    q[1] -= min;
                    if (q[1] == 0){
                        sellQue.poll();
                    }
                }
                if (o[1] > 0){
                    buyQue.offer(i);
                }
            }else{
                while(!buyQue.isEmpty() && o[1] > 0){
                    int[] q = orders[buyQue.peek()];
                    if(q[0] < price)break;
                    int min = Math.min(o[1], q[1]);
                    o[1] -= min;
                    q[1] -= min;
                    if(q[1] == 0) {
                        buyQue.poll();
                    }
                }
                if(o[1] > 0) {
                    sellQue.offer(i);
                }
            }
        }
        for (int[] o : orders){
            ans = (ans + o[1]) % (1000000007);
        }
        return ans;
    }
}
