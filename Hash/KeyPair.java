import java.util.*;

public class KeyPair {

  static  boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
        System.out.println(hash);

        for (int i = 0; i < n; i++) {
            int numberToFind = x - arr[i];
            if (hash.containsKey(numberToFind)) {
                System.out.println((numberToFind));

                return true;
            }

            hash.put(arr[i],i); 
            System.out.println(hash);
        }
        

        
        return false;
    }
    public static void main(String[] args) {
        

       int  n = 5, x = 10;
        int arr[] = {1, 2, 4, 3, 6};

    System.out.println(KeyPair.hasArrayTwoCandidates(arr, n, x));

 
       
    }
}
