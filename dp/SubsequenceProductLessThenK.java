public class SubsequenceProductLessThenK {
    // Count all subsequences having product less than K

    static int ProductSeqLK(int[] arr, int k) {

        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= arr[j];
                if (product < k) {
                    count++;
                } else {
                    continue;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 10;
        System.out.println(ProductSeqLK(arr, k));



    int i=0,j=0,count=0,p=1;
    while(j <arr.length){
        p *= arr[j];
        while(p >= k ) {
            p /=arr[i++];
            count += 1+(i+j);
            j++;
        }
    }

System.out.println(count);




    }
}
