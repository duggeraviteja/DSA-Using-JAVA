import java.util.*;

public class SpiralTraersing {

   
    static void SpiralPrint(int arr[][],int r, int c){
        int minr = 0 , minc = 0;
        int maxr = arr.length-1, maxc = arr.length-1;
        int total = r*c;
        int count = 0;

        while (true) {
            // left 
            for (int i = minr, j = minc ; i <= maxr && count < total; i++) {
                System.out.print(arr[i][j] +" ");
                count++;
            }
            minc++;
            
            // bottom
            for (int i = maxr, j = minc ; j <= maxc && count < total; j++) {
                System.out.print(arr[i][j] +" ");
                count++;
            }
            maxr--;
             // right 

            for (int i = maxr, j = maxc ; i >= minr && count < total; i--) {
                System.out.print(arr[i][j] +" ");
                count++;
            }
            maxc--;
             // top 

            for (int i = minr, j = maxc ; j >= minc && count < total; j--) {
                System.out.print(arr[i][j] +" ");
                count++;
            }
            minr++;
            
        }

    }




    static void spiralPrintMatrix(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;
 
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        */
 
        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;
 
            // Print the last column from the remaining
            // columns
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;
 
            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }
 
            // Print the first column from the remaining
            // columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }




    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> output = new ArrayList<Integer>();
        int row = 0;
        int col = 0;
        
        while(row<r && col<c)
        {
           //storing the elements of 1st row from the remaining rows, in a list.
           for(int i=col; i<c; i++)
               output.add(matrix[row][i]);
           row++;
           
           //storing elements of last column from remaining columns, in list.
           for(int i=row; i<r; i++)
               output.add(matrix[i][c-1]);
           c--;
           
           //storing the elements of last row from remaining rows, in a list.
            if(row<r)
            {
                for(int i=c-1; i>=col; i--)
                    output.add( matrix[r-1][i]);
                r--;
            }
            
           //storing elements of 1st column from the remaining columns, in list.
            if(col<c)
            {
                for(int i=r-1; i>=row; i--)
                    output.add( matrix[i][col]);
                col++;    
            }   
        }
        //returning the list.
        return output;
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };  

         //clock wise
     // SpiralPrint( arr,4,4);

     // Anti clock
    // spiralPrintMatrix(4, 4, arr);
System.out.println(spirallyTraverse(arr,4,4));


    }
}
