public class PlaceTiles {

    static int countWays(int n, int m) {
        // table to store values
        // of subproblems
        int count[] = new int[n + 1];
        count[0] = 0;

        // Fill the table upto value n
        int i;
        for (i = 1; i <= n; i++) {

            // recurrence relation
            if (i > m)
                count[i] = count[i - 1] + count[i - m];

            // base cases
            else if (i < m || i == 1)
                count[i] = 1;

            // i = = m
            else
                count[i] = 2;
        }

        // required number of ways
        return count[n];
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        System.out.println("Number of ways = "
                + countWays(n, m));


    }
}
