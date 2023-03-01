package a_daily_topic;

public class No_1812 {
    public boolean squareIsWhite(String coordinates) {
        int ans = 0;
        ans += coordinates.charAt(0) - 'a';
        ans += coordinates.charAt(1) - '0';
        return ans % 2 == 0;
    }
}
