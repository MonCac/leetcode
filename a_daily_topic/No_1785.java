package a_daily_topic;

// 构成特定和需要添加的最少元素

public class No_1785 {
    public int minElements(int[] nums, int limit, int goal) {
        long ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += nums[i];
        }
        ans = goal - ans;
        if (ans % limit == 0){
            return (int) Math.abs(ans / limit);
        }else{
            return (int) Math.abs(ans / limit) + 1;
        }
    }
}
