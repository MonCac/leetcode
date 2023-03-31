package lanqiao_sprint;

import java.util.zip.CheckedOutputStream;

public class Day02_002 {
    public static void main(String[] args) {
        for (int A = 0; A < 10; A++){
            for (int B = 0; B < 10; B++){
                if (A == B){
                    continue;
                }
                for (int C = 0; C < 10; C++){
                    if (A == C || B == C){
                        continue;
                    }
                    for (int D = 0; D < 10; D++){
                        if (A == D || B == D || C == D){
                            continue;
                        }
                        for (int E = 0; E < 10; E++){
                            if (A == E || B == E || C == E || D == E){
                                continue;
                            }
                            for (int i = 0; i < 10; i++){
                                int m = E + D * 10 + C * 100 + B * 1000 + A * 10000;
                                int n = A + B * 10 + C * 100 + D * 1000 + E * 10000;
                                if (m * i == n){
                                    System.out.println(m);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
