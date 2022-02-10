import java.util.*;

public class WboxBboxGCD {
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
    
    
     static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
    public static void main(String[] args) {


        int n = 2;
        int arr[] = {2,10,5,15};
        
        //2 10 // 5 15
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n*2];
        // for(int i=0;i<n*2;i++){

        //     arr[i] = sc.nextInt(); 
        //     }
            
      
       
       int bbox[] = new int[arr.length];
       int wbox[] = new int[arr.length];
       int index = 0;
       int index2 = 0;
       int g1 =0;
       int g2=0;
       for(int i=0;i<arr.length;i=i+2){
           bbox[index++] = arr[i];
          
       }
           for(int i=1;i<arr.length;i=i+2){
           wbox[index2++] = arr[i];    
       }

       int l=0;
       int r=0;

       for(int i=0;i<bbox.length;i++){
            g1 = gcd(bbox[l],bbox[l+1]);
           
       }

         for(int i=1;i<wbox.length;i++){
            g2 = gcd(wbox[r],wbox[r+1]);
       
       }
       
    //   int g2 = gcd(wbox[0],wbox[1]);
    
    System.out.println(g1 +" " +g2);
       
       System.out.print(lcm(g1,g2));
       

        
    }
}
