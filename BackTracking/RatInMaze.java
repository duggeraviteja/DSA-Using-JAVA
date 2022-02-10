import java.util.ArrayList;
import java.util.*;

public class RatInMaze {

    public static int[][] visited = new int[5][5];
    public static ArrayList<String> result = new ArrayList<String>();


    public static void path(int[][] m, int x, int y, String dir, int n) {
        if (x == n - 1 && y == n - 1) {
            result.add(dir);
            return;
        }

        if (m[x][y] == 0 || visited[x][y] == 1) {
            return;
        }

        visited[x][y] = 1;
        if (x > 0) {
            path(m, x - 1, y, dir + 'U', n);
        }
        if (y > 0) {
            path(m, x, y - 1, dir + 'L', n);
        }
        if (x < n - 1) {
            path(m, x + 1, y, dir + 'D', n);
        }
        if (y < n - 1) {
            path(m, x, y + 1, dir + 'R', n);
        }
        visited[x][y] = 0;
    }

    static ArrayList<String> findPath(int m[][], int n) {

        // Your code
      
     //   result.clear();

        if (m[0][0] == 0 || m[n - 1][n - 1] == 0) {
            return result;
        }

        path(m, 0, 0, "", n);
        Collections.sort(result);

        return result;

    }

    static boolean isSafe(int arr[][], int i, int j) {
        int n = arr.length;
        if (i < n && j < n && arr[i][j] == 1) {
            return true;
        }
        return false;
    }

    static void ratInMaze(int[][] arr, int n) {

        int sol[][] = new int[arr.length][arr[0].length];
        boolean a = ratInMazeRecurison(arr, n, 0, 0, sol);
        if (a)
            System.out.println(Arrays.deepToString(sol));
        else
            System.err.println("Path not found");

    }

    static boolean ratInMazeRecurison(int[][] arr, int n, int i, int j, int[][] sol) {

        if (i == n - 1 && j == n - 1) {
            sol[i][j] = 1;
            return true;
        }
        
        if (isSafe(arr, i, j)) {
            sol[i][j] = 1;

            if (ratInMazeRecurison(arr, n, i + 1, j, sol))
                return true;

            if (ratInMazeRecurison(arr, n, i, j + 1, sol))
                return true;

            sol[i][j] = 0;
            return false;

        }

        return false;
    }

    public static void main(String[] args) {
        int N = 4,
                m[][] = { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 1, 1, 0, 0 },
                        { 0, 1, 1, 1 } };

        System.out.println(findPath(m, N)); // directions
        ratInMaze(m, m.length); //array

    }
}
