import java.util.*;
import java.io.*;

public class LargestSqaureFormed_1_Matrix {
    static int maxSquare(int n, int m, int mat[][]) {
        // code here

        int dp[][] = new int[n + 1][m + 1];
        int maxsquare = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= mat[0].length; j++) {

                if (mat[i - 1][j - 1] == 1) {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }

                maxsquare = Math.max(maxsquare, dp[i][j]);

            }
        }

        return maxsquare;
    }

    public static void main(String[] args) {
        int n = 2, m = 2;
        int mat[][] = { { 1, 1 },
                { 1, 1 } };
      System.out.println(maxSquare(n, m, mat));



      
    }
}
