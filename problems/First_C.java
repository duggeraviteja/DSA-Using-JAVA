public class First_C {  

             static int a = 10,b;
             int d;

      public void myMethod()   
    {  

            System.out.println(" d -" +d);


    System.out.println("Method");  
    }  
      
    {  
    System.out.println(" Instance Block");  
    }  
          
    public void First_C()  
    {  
    System.out.println("Constructor ");  
    }  
    static {  
        System.out.println("static block");  
    }  
    public static void main(String[] args) {  
    First_C c = new First_C();  
    First_C f = new First_C();  

    c.myMethod();  
      c.First_C();  
   
      System.out.println(a + " -" +b);


  }  
} 






