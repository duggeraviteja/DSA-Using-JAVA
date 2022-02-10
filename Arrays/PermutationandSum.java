import java.util.Arrays;

import javax.xml.transform.SourceLocator;

public class PermutationandSum {

    static int[] noOfDigits(int N) {
        
        String s = String.valueOf(N);
        int arr[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            char c  = s.charAt(i);
            arr[i] = Character.getNumericValue(c);  
        }
        return arr;
    }

   static int factorial(int n)
{
    int f = 1;
    if (n == 0|| n == 1)
        return 1;
    for (int i = 2; i <= n; i++)
        f = f * i;
    return f;
}

   static public int[] permutaion(int n)
    {
      

     
     int arr[] = noOfDigits(n);
     n  = arr.length;
     int fact = factorial(n);

    
     System.out.println(n);

System.out.println(Arrays.toString(arr));

     
          int digitsum = 0;
          for (int i = 0; i < n; i++)
              digitsum += arr[i];
    
            digitsum *= (fact / n);
      
          // Compute result (sum
          // of all the numbers)
          int res = 0;
          for (int i = 1, k = 1;
                  i <= n; i++)
          {
              res += (k * digitsum);
              k = k * 10;
          }
    
    System.out.println(fact+" "+res);
    int ans[] = new int[2];
    ans[0] = fact;
    ans[1] = res;
 
    return ans;
        
    }

    public static void main(String[] args) {
        int n=11;

        int ans[] = permutaion(n);
        System.out.println(Arrays.toString(ans));
    }

}
