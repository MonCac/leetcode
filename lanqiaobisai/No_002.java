package lanqiaobisai;

public class No_002 {
    public static void main(String[] args){
        int[] In = new int[]{1,0,1,0,1};
        int a1 = (2 * 17) * 27 + (2 * 17 + 10) * 10;
        int a0 = 17 * 27 + (17 + 2 * 10) * 10;
        System.out.println(a1 * (a1 + a0) * 2 + a0 * a1 * 2 + a0 * a0);
        System.out.println(a0 + a1);
    }
}
