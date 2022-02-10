import java.util.*;

public class No_Sub_Arr_Sum_equalsToK {

    //  Naive and Simple Solution 
    static int Solution(int[] arr,int k){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int max=0;
            for (int j = i; j < arr.length; j++) {
                max += arr[j];
                if(max == k){
                    count++;
                }
            }
        }
        return count;
    }

    // Now Implement using HashMap Optimised Code
    static int SolutionWithHashMap(int[] arr,int k){
        int count=0;
        int res = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
           if (map.containsKey(count-k)) {
               res +=map.get(count-k);
           }
           map.put(count,map.getOrDefault(count, 0) +1);
        }
        System.out.println(map);
        return res;
    }


    public static void main(String[] args) { 
      //  int arr[] = {10, 2, -2, -20, 10};
        int arr[] = {1, 4, 45, 6, 0, 19};
       System.out.println(Solution(arr,51));

     System.out.println(SolutionWithHashMap(arr,33));




            

    }
}
