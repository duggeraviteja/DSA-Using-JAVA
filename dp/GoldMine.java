public class GoldMine {
    static int maxGold(int n, int m, int M[][]) {
        // code here
        int dp[][] = new int[n + 2][m + 2];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j][i] = M[j - 1][i - 1] + Math.max(dp[j - 1][i - 1],
                        Math.max(dp[j][i - 1], dp[j + 1][i - 1]));
            }
        }

        int ans = 0;

        for (int i = 0; i <= n; i++)
            ans = Math.max(dp[i][m], ans);
        return ans;

    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int[][] M = { { 1, 3, 3 },
                { 2, 1, 4 },
                { 0, 6, 4 } };

        System.out.println(maxGold(n, m, M));
    }
}
