import java.util.*;

public class LongestIncreasingSubsequence {

    static int LIS(int arr[],int n){

        int dp[] = new int[n];
        Arrays.fill(dp, 1);

        int max= Integer.MIN_VALUE;


        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {

                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        System.out.println(Arrays.toString(dp));

    
        return max;
    }


    static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;
 
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
        for (i = 1; i < n; i++) { 
            for (j = 0; j < i; j++) { 
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                {
                    lis[i] = lis[j] + 1;
                }
            }
            max = Math.max(max, lis[i]);
        
        }
 
        /* Pick maximum of all LIS values */
        // for (i = 0; i < n; i++)
        //     if (max < lis[i])
        //         max = lis[i];
 
        return max;
    }




    
    public static void main(String[] args) {
        // int arr[] = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15 };
       // int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };

      int arr[] =  {1, 101, 2, 3, 100} ;
       
        System.out.println(LIS(arr,arr.length));
        System.out.println(lis(arr,arr.length));
  
    }
}
