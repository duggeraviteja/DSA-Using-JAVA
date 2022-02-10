import java.util.Arrays;
public class NoOfWaysToReachDestinationOfMaze {
    static int R ;
    static int C ;

    static int countPath(int maze[][]) {

        if (maze[0][0]==-1 || maze[R-1][C-1] == -1)
            return 0;
    
        for (int i = 0; i < R; i++)
        {
            if (maze[i][0] == 0)
                maze[i][0] = 1;
  
            else
                break;
        }
    
        for (int i =1 ; i< C ; i++)
        {
            if (maze[0][i] == 0)
                maze[0][i] = 1;
    
            else
                break;
        }
    
        for (int i = 1; i < R; i++)
        {
            for (int j = 1; j <C ; j++)
            {
              
                if (maze[i][j] == -1)
                    continue;
    
                if (maze[i - 1][j] > 0)
                    maze[i][j] = (maze[i][j] + 
                                 maze[i - 1][j]) %1000000007;
    

                if (maze[i][j - 1] > 0)
                    maze[i][j] = (maze[i][j] + 
                                  maze[i][j - 1]) % 1000000007 ;
            }
        }

        System.out.println(Arrays.deepToString(maze));
    
        return maze[R - 1][C - 1] % 1000_000_007 ;

    }
    public static void main(String[] args) {
        int n = 3, m = 3, k = 2;

        R = 3;
        C = 3;


        int arr[][] = new int[n][m];
        int blocked[][] = {{1,2},{3,2}};


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = 0;
            }
        }

        k = blocked.length;
        for (int i = 0; i < k; i++) {
            arr[blocked[i][0] - 1][blocked[i][1] - 1] = -1;
        }


       //System.out.println(Arrays.deepToString(arr));


        System.out.println(countPath(arr));



    }
}
