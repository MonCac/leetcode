package hot100.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class No_118 {
    public static void main(String[] args){
        generate(5);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> iteration = new ArrayList<>();
        iteration.add(1);
        ans.add(new ArrayList<>(iteration));
        if (numRows == 1){
            return ans;
        }
        iteration.add(1);
        ans.add(new ArrayList<>(iteration));
        if (numRows == 2) {
            return ans;
        }
        for (int i = 2; i < numRows; i++){
            List<Integer> index = ans.getLast();
            List<Integer> line = new ArrayList<>();
            line.add(1);
            for (int j = 0; j < i - 1; j++){
                line.add(index.get(j) + index.get(j + 1));
            }
            line.add(1);
            ans.add(line);
        }
        return ans;
    }
}
