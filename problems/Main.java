import java.util.*;

public class Main {
    public static void main(String[] args) {
    


        int n =5;
        int arr[] = {10,15,20,35,70};

        System.out.println(HCF(n,arr));
    }



        public static int HCF(int input1,int[] input2){
            int result = 0;
        
            System.out.println(l);
            for (int element: input2){
                result = gcd(result, element);
     
                if(result == 1)
                {
                   return 1;
                }
            }
     
            return result;

        }

        static int gcd(int a, int b)
        {
            if (a == 0)
                return b;
            return gcd(b % a, a);
        }
     
    
   
   
   
}



