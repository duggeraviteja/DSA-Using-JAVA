import java.util.*;

public class LongestBitonicSequences {
    public static void main(String[] args) {

        // LIS implementation
        int arr[] = { 80, 60, 30, 40, 20, 10 };

        int Lis[] = new int[arr.length];
        Arrays.fill(Lis, 1);
        int max1 = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j]) {
                    Lis[i] = Math.max(Lis[i], Lis[j] + 1);
                }
            }
            max1 = Math.max(max1, Lis[i]);
        }

        System.out.println("LIS -- " + max1);

        System.out.println(Arrays.toString(Lis));

        // LDS Implementation

        int Lds[] = new int[arr.length];
        Arrays.fill(Lds, 1);
        int max = 0;

        for (int i = arr.length - 2; i >= 0; i--) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] > arr[j]) {
                    Lds[i] = Math.max(Lds[i], Lds[j] + 1);
                }
            }
            max = Math.max(max, Lds[i]);
        }

 
        System.out.println("Lds  : " + max);

        int omax =0;

        for (int i = 0; i < arr.length; i++) {  
            omax = Math.max(Lis[i] + Lds[i]-1 , omax);
            // if (Lis[i] + Lds[i] - 1 > omax) {
            //     omax = Lis[i] + Lds[i] - 1;
            // }
        }

        System.out.print("longest bitonic subsequence : ");
        System.out.println(omax);
        System.out.println(Arrays.toString(Lds));
    }
}