//import jdk.tools.jlink.internal.plugins.SystemModulesPlugin;

//package problems.patterns;

public class Triangle {


        public void  Trainage_Star() {

       

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();  
        }   

        System.out.println(" ----------------------------------");
        
        for (int i = 5; i >=1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print("* ");
            }
            System.out.println();
            
        }   
        System.out.println(" ----------------------------------");
 int row=6;

        for (int i = 0; i < row; i++) {
     
            for (int j = 2 * (row - i); j >=0; j--) {
                
                System.out.print(" "); 
            }
 
            for(int k=0;k<=i;k++){
            
                System.out.print("* ");
            }
            System.out.println();  
        }  

     

        System.out.println("----pyramid pattern---\n ");

        for(int i=0;i<row;i++) {
            for(int j=row-i;j>1;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0;i<row;i++) {
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }

            for(int j=row-i;j>1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    
    public static void main(String[] args) {

        Triangle ob = new Triangle();
        ob.Trainage_Star();
     }
}
