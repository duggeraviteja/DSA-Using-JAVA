
public class Factorial {
    static long[] factorial(long arr[]) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = fact(arr[i]);
        }
        return arr;
    }

    static long fact(long n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }

    public static void main(String[] args) {
        long arr[] = { 2, 3, 4 };

        System.out.print(factorial(arr));
        // System.out.print(fact());

        for (long i : arr) {
            System.out.println(i);
        }

        int MAX = 100000;
        System.out.println(MAX);

    }
}
