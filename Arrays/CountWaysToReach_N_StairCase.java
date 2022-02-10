class CountWaysToReach_N_StairCase {

    static int countWaysOneOrTwo(int n) {
        int mod = 1000000007;
        int res[] = new int[n + 1];
        res[0] = 1;
        res[1] = 1;

        for (int i = 2; i <= n; i++) {
            res[i] = (res[i - 1] + res[i - 2]) % mod;
        }

        return res[n];

    }

    static int CountStairMostK(int n, int k) {
        if (n == 1 || k == 1) {
            return 1;
        }

        // create an array of size `n+1` for storing solutions to the subproblems
        int[] lookup = new int[n + 1];

        lookup[0] = 1;
        lookup[1] = 1;
        lookup[2] = 2;

        // fill the lookup table in a bottom-up manner
        for (int i = 3; i <= n; i++) {
          //  lookup[i] = 0;
            for (int j = 1; j <= k && (i - j) >= 0; j++) {
                lookup[i] += lookup[i - j];
            }
        }

        return lookup[n];
    }

    public static int countWays123(int n)
    {
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
 
        for (int i = 3; i <= n; i++)
            res[i] = res[i - 1] + res[i - 2] + res[i - 3];
 
        return res[n];
    }
    public static void main(String[] args) {

        int n = 4;
        int k = 2;

        // When only 1 or 2 steps allowed
        System.out.println(countWaysOneOrTwo(n)); // 5 

        // when Find total ways to reach n’th stair with at-most `m` steps

        System.out.println(CountStairMostK(n, k));

        //when it allows 1 , 2 or 3 steps at a time
        System.out.println(countWays123(n)); // 7 

    }
}
