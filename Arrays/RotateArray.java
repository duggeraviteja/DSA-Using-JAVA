import java.util.Arrays;

public class RotateArray {

    public static void rotate(int arr[] ,int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        System.out.println("Before rotate");

        System.out.println(Arrays.toString(arr));
        int d =2;
        int n=arr.length;
        System.out.println("after rotate");

        rotate(arr,0,d-1);
        rotate(arr, d,n-1 );
        rotate(arr, 0, n-1);

    }
}
