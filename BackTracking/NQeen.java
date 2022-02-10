import java.util.Arrays;

public class NQeen {
    static  int n ;
   static boolean isSafe(int board[][], int row, int col)
    {
        int i, j;
 
        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
 
        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
 
        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < n; i++, j--)
            if (board[i][j] == 1)
                return false;
 
        return true;
    }
 

    static boolean solveNQ(int board[][], int col) {

        if (col >= n)
            return true;
 
        for (int i = 0; i < n; i++) {
      
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
 
                if (solveNQ(board, col + 1) == true)
                    return true;
                board[i][col] = 0; // BACKTRACK
            }
        }
 
        return false;
    }

    public static void main(String[] args) {
        int board[][] = { { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 },
                          { 0, 0, 0, 0 } };
         n = 4;

     
        if (solveNQ(board, 0) == false) {
            System.out.print("Solution does not exist");
        }
 
       // printSolution(board);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(" " + board[i][j]
                                 + " ");
            System.out.println();
        }



    }
}
