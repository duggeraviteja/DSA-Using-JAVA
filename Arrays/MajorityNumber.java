import java.util.HashMap;
import java.lang.Thread.State;
import java.util.*;

public class MajorityNumber {

    static int Majele(int arr[], int size)
    {
        int count=1;
        int first=0;
        for(int i=1;i<size;i++){
            if(arr[first]==arr[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                first=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<size;i++){
          if(arr[i]==arr[first]){
              count++;
          }  
        }
        if(count>size/2){
            return arr[first];
        }
        return -1;
        
    }








    static int majorityElement(int arr[], int size) {
        int count = 0;
        int maxi = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        {
            for (int i = 0; i < size; i++) {
                    mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
            }

            for (int i : mp.keySet()){
                count = mp.get(i);
                maxi = Math.max(maxi, count);
            }
            
            if (maxi > size / 2) {
                for ( int i : mp.keySet()) {
                    if (maxi == mp.get(i) ) {
                        return i;
                    }
                }

            }

            return -1;
        }
    }

    public static void main(String[] args) {

       int N = 3 ;
       int A[] = {3,1,3,3,2}  ; 
       System.out.println(majorityElement(A, N));
    }
}
