package leetbooks.primary_algorithms;

// Fizz Buzz

import java.util.ArrayList;
import java.util.List;

public class No_08_001 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            StringBuffer sb = new StringBuffer();
            if(i % 3 == 0)
                sb.append("Fizz");
            if(i % 5 == 0)
                sb.append("Buzz");
            if(sb.isEmpty())
                sb.append(i);
            list.add(sb.toString());
        }
        return list;
    }
}
