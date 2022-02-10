public class DiagonalTraversal {

    static void DiaPrint(int[][] arr){
      
        for (int i = 0;i <arr.length ; i++) {
           int g=i;
                for (int j = arr.length-1 ; j >=0 && g>=0; j--) {
                    
                     System.out.print(arr[g--][j] +" ");
                    }
                }

  
           
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };  
        DiaPrint(arr);
    }
}
