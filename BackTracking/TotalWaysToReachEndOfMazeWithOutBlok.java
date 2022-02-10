import java.util.*;

public class TotalWaysToReachEndOfMazeWithOutBlok {
    static int count;
    static int countWays(int[][] arr, int n, int i, int j) {
        if (i == n || j == n) {
            return 0;
        }
        if (i == n - 1 || j == n - 1) {
            return 1;
        }

        int downPath = countWays(arr, n, i + 1, j);

        int rightPath = countWays(arr, n, i, j + 1);

        return downPath + rightPath;

    }

    static void getWays(int mat[][], int m, int n,
            int i, int j, List<Integer> list) {
        // return if i or j crosses matrix size
        if (i > m || j > n)
            return;   

        list.add(mat[i][j]);
        count++;

        if (i == m && j == n) {
            System.out.println(list);
            
        }
        getWays(mat, m, n, i + 1, j, list);
        getWays(mat, m, n, i, j + 1, list);
        list.remove(list.size() - 1);

    }

    public static void main(String[] args) {
        int N = 4,
                arr[][] = { { 0, 0, 0, 0 },
                            { 0, 0, 0, 0 },
                            { 0, 0, 0, 0 },
                            { 0, 0, 0, 0 } };
        // for square matrix
        System.out.println(countWays(arr, N, 0, 0));

        // Print all possible paths from top left to bottom
        // right of a mXn matrix

        int m = 2;
        int n = 3;
        int mat[][] = { { 1, 2, 3 },
                        { 4, 5, 6 } };
        List<Integer> list = new ArrayList<>();
        getWays(mat, m - 1, n - 1, 0, 0, list);

    }
}
