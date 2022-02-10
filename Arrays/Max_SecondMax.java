import java.util.*;
import java.util.Collections;

public class Max_SecondMax {

    static void largetSecondlargest(int arr[] , int n){

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max2 =max;
                max = arr[i];
            }
            else if(arr[i] > max2 && max2 != max){
                max2 = arr[i];
            }
        }

        if(max2 == Integer.MIN_VALUE){
            max2 = -1;
        }
        System.out.println(max+" "+max2);

    }
    public static void main(String[] args) {
        int N = 5;
int arr[] = {-1,-2,-3,-4,-5};
ArrayList<Integer> li = new ArrayList<>();
li.add(1);
li.add(2);
li.add(3);
li.add(4);
li.add(5);
li.add(6);

// Collections.sort(arr,
// (a, b) -> b.profit - a.profit);



Max_SecondMax.largetSecondlargest(arr,N);


Collections.sort(li,(a,b)->(b-a));
System.out.println(li);
// Arrays.setAll(arr, i -> ~arr[i]);
// Arrays.toString(arr);



// Arrays.sort(arr, (a, b) -> a.length() - b.length());
// Arrays.sort(arr, Comparator.comparingInt(String::length));



    }
}
