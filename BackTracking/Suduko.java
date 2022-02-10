
public class Suduko {

      
  static boolean isSafe(int grid[][],int num,int i,int j) 
  {
      for(int x=0;x<9;x++)
      if(grid[i][x]==num || grid[x][j]==num) {
        return false;
      }
     

      int si = (i/3)*3, sj = (j/3)*3;

      for(int x=0;x<3;x++) 
      {
          for(int y=0;y<3;y++)
              if(grid[x + si][y + sj]==num)
                return false;
      }
      
      return true;
  }
  
 static  boolean helper(int grid[][],int i,int j) 
  {
      if(i==9)
      return true;
      
      if(j==9)
      return helper(grid,i+1,0);

      if(grid[i][j]!=0)
      return helper(grid,i,j+1);
      
      for(int n=1;n<=9;n++) 
      {
          if(isSafe(grid,n,i,j))
          {
              grid[i][j] = n;
              if(helper(grid,i,j+1)) 
              return true;
          }
      }
      grid[i][j] = 0;
      return false;
  }



  static boolean SolveSudoku(int grid[][])
  {
      return helper(grid,0,0);
  }
    public static void main(String[] args) {
      int  grid[][] = 
                    {{3, 0 ,6, 5, 0, 8, 4, 0, 0},
                    {5, 2, 0 ,0 ,0 ,0 ,0 ,0, 0},
                    {0 ,8 ,7 ,0, 0 ,0 ,0 ,3 ,1 },
                    {0, 0 ,3 ,0, 1, 0, 0, 8, 0},
                    {9, 0 ,0 ,8 ,6 ,3 ,0 ,0 ,5},
                    {0, 5, 0, 0, 9, 0, 6, 0, 0},
                    {1, 3, 0, 0, 0 ,0 ,2 ,5 ,0},
                    {0, 0 ,0 ,0, 0, 0, 0, 7, 4},
                    {0, 0, 5 ,2, 0, 6, 3, 0, 0}};

                    SolveSudoku(grid);



                    for(int i=0;i<9;i++)
                    {
                        for(int j=0;j<9;j++)
                       System.out.print(grid[i][j]+" ");

                       System.out.println();
                    }

    }
}