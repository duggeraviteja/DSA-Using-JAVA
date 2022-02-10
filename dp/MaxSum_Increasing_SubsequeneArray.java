import java.util.*;

public class MaxSum_Increasing_SubsequeneArray {

    static int Solution(int[] arr, int n) {

        int dp[] = arr.clone();

        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {   
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                dp[i]= Math.max(dp[i], dp[j]+arr[i]);
            }
            max = Math.max(max,dp[i]);
        }

        System.out.println(Arrays.toString(dp));
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 101, 2, 3, 100} ;
        System.out.println(Solution(arr, arr.length));


      
    }
}