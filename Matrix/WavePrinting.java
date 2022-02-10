public class WavePrinting {


    // top-bottom bottom-top printing from starting 
    static void WavePrint(int r,int c,int[][] arr ){ 

        for (int j = 0; j < arr[0].length; j++) {
            if(j%2 == 0){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] +" ");
                }
                System.out.println(" ");
            } else{
                for (int i = 0; i <arr.length;i++) {
                    System.out.print(arr[i][j] +" ");
                }
                System.out.println(" ");

            }    
    }
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };  

         System.out.println("top-bottom bottom-top ");
     WavePrint(4, 4, arr);


     // left-right and right-left printing from ending

     System.out.println("left-right and right-left ");

   for (int i = 0;i <arr.length ; i++) {
       if(i%2==0){
           for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[i][j] +" ");
           }
           System.out.println();
           
       } else {
        for (int j = arr.length-1; j >=0; j--) {
            System.out.print(arr[i][j] +" ");
        }
        System.out.println();
       }
      
   }

    }
}
 

