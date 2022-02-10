public class SmallestSubArrSumGtrThenK {
    static int Solution(int arr[],int k){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = i; j < arr.length; j++) {
                sum +=arr[j];
                if(sum>k){
                    min = Math.min(min,j-i+1);
                }
            }
        }
        return min;
    }



public static int smallestSubWithSum(int a[], int x) {
    int sum=0;
    int n =a.length;
      int min=Integer.MAX_VALUE;
      int i=0,j=0;
      while(j<n)
      {
         while(sum<=x && j<n)
         {
             sum+=a[j++];
         }
         while(sum>x)
         {
             if(j-i<min)
             min=j-i;
             sum-=a[i];
             i++;
         }
      }
      return min;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 0, 19};
        int k =51;
        System.out.println(Solution(arr,k));
        System.out.println(smallestSubWithSum(arr,k));

    }
}
