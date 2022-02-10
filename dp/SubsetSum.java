public class SubsetSum {
    static boolean isSubsetSum(int N, int arr[], int sum){
       
        boolean subset[][]= new boolean[N + 1][sum + 1];
     
        for (int i = 0; i <= N; i++)
            subset[i][0] = true;
     
  
        for (int i = 1; i <= sum; i++)
            subset[0][i] = false;

             for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < arr[i - 1])
                    subset[i][j] = subset[i - 1][j];
                if (j >= arr[i - 1])
                    subset[i][j] = subset[i - 1][j]
                                   || subset[i - 1][j - arr[i - 1]];
            }
        }
     
        
     
        return subset[N][sum];
    }
    public static void main(String[] args) {
       int N = 6;
       int arr[] = {3, 34, 4, 12, 5, 2};
       int sum = 30;
       System.out.println(isSubsetSum(N,arr,sum));
    }
}
