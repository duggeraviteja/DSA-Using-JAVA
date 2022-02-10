import java.util.Arrays;

class KnapSack0_1 {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        int []dp = new int[W + 1];


        for (int i = 0; i < n ; i++) {
          for (int j = W; j >= 0; j--) {
     
            if (wt[i ] <= j)
            dp[j] = Math.max(dp[j],dp[j - wt[i]] + val[i]);
          }
        }

       // System.out.println(Arrays.toString(dp));

       
        System.out.println(dp[W]);








    }
}