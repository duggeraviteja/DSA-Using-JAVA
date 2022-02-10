public class LCIS {
    // Longest Common Increasing Subsequence
    static int LCIS(int[] arr1, int m, int[] arr2, int n) {
        // code here
        int dp[] = new int[m];
        for (int i = 0; i < n; i++) {
            int cur = 0;
            for (int j = 0; j < m; j++) {
                if (arr2[i] == arr1[j]) {
                    dp[j] = Math.max(dp[j], cur + 1);
                } else if (arr2[i] > arr1[j]) {
                    cur = Math.max(cur, dp[j]);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < m; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {

        int M = 4;
        int Arr1[] = { 3, 4, 9, 1 };
        int N = 7;
        int Arr2[] = { 5, 3, 8, 9, 10, 2, 1 };

        System.out.println(LCIS(Arr1, M, Arr2, N));
    }
}
