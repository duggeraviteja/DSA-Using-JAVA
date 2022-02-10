public class SequenceOfSequence {
    static int getSeq(int n, int m) {
        if (m > n) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        return getSeq(n - 1, m) + getSeq(n / 2, m - 1);
    }

    static int getSeqDp(int n, int m) {

        int dp[][] = new int[n + 1][m + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j > i)
                    dp[i][j] = 0;
                else if (j == 1) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i / 2][j - 1];
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        System.out.println(getSeq(10, 4)); // recursion

        System.out.println(getSeqDp(10, 4));
    }
}
