import java.util.Arrays;
import java.util.*;

class Testing {
    static void printknapSack(int W, int wt[],
            int val[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = Math.max(val[i - 1] +
                            K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int res = K[n][W];
        System.out.println("Maximum  Revenue is $" + res);

        w = W;
        for (i = n; i > 0 && res > 0; i--) {

            if (res == K[i - 1][w])
                continue;
            else {
                // This item is included.
                // System.out.print(val[i - 1] + " ");
                list.add(val[i - 1]);

                res = res - val[i - 1];
                w = w - wt[i - 1];
            }
        }

        Collections.reverse(list);

        for (int element : list) {

            for (int j = 0; j < wt.length; j++) {
                if (element == val[j]) {
                    System.out.print("Product" + j + 1 + ", ");
                }
            }

        }
        System.out.println("can be terminated");
    }

    public static void main(String[] args) throws ClassNotFoundException {

        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        printknapSack(W, wt, val, n);

    }

}