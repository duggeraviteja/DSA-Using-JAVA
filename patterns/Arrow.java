public class Arrow {
    public static void main(String[] args) {
        int row = 10;
        for(int i=0;i<row;i++) {
            for(int j=row-i;j>1;j--){
                System.out.print("   ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            
            if(i==row-1){
                  for(int m=0;m<10;m++){
            System.out.print("* ");
        }
            }
            System.out.println();
        }
        
        for(int i=0;i<row-1;i++) {
            for(int k=0;k<=i;k++){
                System.out.print("   ");
            }

            for(int j=row-i;j>1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }


        int rows = 10,i,j;


        for (i= 0; i<= rows-1; i++)  
        {  
        for (j=0; j<=i; j++)   
        {  
        System.out.print("* ");  
        }   
        System.out.println();   
        }  
        
        
        for (i=rows-1; i>=0; i--)  
        {  
        for(j=0; j <= i-1;j++)  
        {  
        System.out.print("*"+ " ");  
        }  
        System.out.println("");  
        }  


    }
}
