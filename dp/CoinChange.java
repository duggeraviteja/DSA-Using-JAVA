import java.util.Arrays;
import java.util.*;
class CoinChange {
    static int Solution(int[] arr,int m,int k){
        int dp[] = new int[k+1];
        dp[0] = 1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = arr[i]; j < dp.length; j++) {
                dp[j] += dp[j-arr[i]];
            }
         //  System.out.println(Arrays.toString(dp));

            
        }
     //   System.out.println(Arrays.toString(dp));
        return dp[k];
    }
    public static void main(String[] args) {
      int m = 4;
      int k=16;
      int s[] ={7,2,6,5};
      System.out.println(Solution(s,m,k));


   


    }
}