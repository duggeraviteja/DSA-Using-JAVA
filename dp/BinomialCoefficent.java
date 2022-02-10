import java.util.Arrays;

public class BinomialCoefficent {
    public static void main(String[] args) {
       int  n = 15, r = 3;

       int dp[] = new int [r+1];
       dp[0] = 1;
       for (int i =1; i <=n; i++) {
           for (int j = Math.min(i, r); j >0 ; j--) {
               dp[j] = dp[j]+dp[j-1];
           }
       }
       System.out.println(Arrays.toString(dp));
       System.out.println(dp[r]);

    }
}
