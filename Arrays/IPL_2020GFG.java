import java.util.*;
public class IPL_2020GFG {


    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
    
        // Declaring and Initializing an ArrayList of base size 0
        ArrayList<Integer> res = new ArrayList<Integer>(0);

        // Declaring and Initializing an ArrayDeque
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int i = 0;

        // adding only the maximum element index in the range
        // 0 to k-1 and polling the remaining elements index
        for (i = 0; i < k; i++) {
            while (dq.isEmpty() == false && arr[i] >= arr[dq.peekLast()])
                dq.pollLast();

            dq.add(i);
        }

        // adding only the maximum element index in the range
        // interval k and polling the remaining elements index
        for (; i < n; i++) {
            // adding the maximum in interval k
            // to the ArrayList
            res.add(arr[dq.peek()]);

            while (dq.isEmpty() == false && (dq.peekFirst() <= i - k))
                dq.pollFirst();

            while (dq.isEmpty() == false && (arr[i] >= arr[dq.peekLast()]))
                dq.pollLast();
            dq.add(i);
        }

        // adding the last element of the
        // ArrayDeque to the ArrayList
        res.add(arr[dq.peek()]);
        dq.pollFirst();

        // returning the ArrayList of maximum elements
        // in subArrays of size k
        return res;
     
        
    }
    public static void main(String[] args) {
        
        int N = 10, K = 4;
int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};

System.out.println(max_of_subarrays(arr,N,K));
    }
}





















// ArrayList<Integer> res = new ArrayList<Integer>();
// int i = 0;
// int j = 0;
// Deque<Integer> dq = new LinkedList<>();
// while (j < arr.length) {
//     while(dq.size() > 0 && dq.peekLast() < arr[j]) {
//         dq.pollLast();
//     }
//     dq.add(arr[j]);
//     if (j - i + 1 < k) {
//         j++;
//     } else if (j - i + 1 == k) {
//         res.add(dq.peekFirst());
//         if(dq.peekFirst() == arr[i]) {
//             dq.pollFirst();
//         }
//         i++;
//         j++;
//     }
// }
// return res;