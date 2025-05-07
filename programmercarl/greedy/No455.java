package programmercarl.greedy;

// 455. 分发饼干

import java.util.Arrays;

public class No455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        int res = 0;
        if (g.length < 1){
            return res;
        }
        for (int j : s) {
            if (start < g.length && j >= g[start]) {
                res++;
                start++;
            }
        }
        return res;
    }
}
