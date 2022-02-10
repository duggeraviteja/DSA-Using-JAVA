
public class LargestSumContiguousSubarray {

    public static int maxSubArraySum(int a[]) {

        int sum = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
    static int maxSubArraySumByDP(int arr[]){

        int max = arr[0];
        int sum = arr[0];
        int n = arr.length;
     
        for (int i = 1; i < n; i++)
        {
            sum = Math.max(arr[i], sum+arr[i]);
            max = Math.max(max, sum);
        }
        return max;
        
        
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,-2,5};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
        System.out.println("Maximum contiguous sum-dp " + maxSubArraySumByDP(a));

    }

}
