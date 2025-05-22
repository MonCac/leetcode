package programmercarl.greedy;

// 860 柠檬水找零

import java.util.HashMap;
import java.util.Map;

public class No860 {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> lemon = new HashMap<>();
        lemon.put(5,0);
        lemon.put(10,0);
        for (int i = 0; i < bills.length; i++){
            if (bills[i] == 5){
                lemon.put(5, lemon.get(5) + 1);
                continue;
            }
            if (bills[i] == 10){
                if (lemon.get(5) < 1){
                    return false;
                }else{
                    lemon.put(5, lemon.get(5) - 1);
                    lemon.put(10, lemon.get(10) + 1);
                }
                continue;
            }
            if (bills[i] == 20){
                if (lemon.get(5) < 1){
                    return false;
                }
                if (lemon.get(10) >= 1){
                    lemon.put(10, lemon.get(10) - 1);
                    lemon.put(5, lemon.get(5) - 1);
                }else{
                    if (lemon.get(5) < 3){
                        return false;
                    }else{
                        lemon.put(5, lemon.get(5) - 3);
                    }
                }
            }
        }
        return true;
    }
}
