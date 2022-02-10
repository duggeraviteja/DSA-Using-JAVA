import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElements_Every_K_Window {

    static ArrayList<Integer> distinctElemets(int[] arr, int n ,int k){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<k-1;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for (int i = k-1 , j=0; i < arr.length;) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            list.add(map.size());

            int freq = map.get(arr[j]);
            if(freq == 1) {
                map.remove(arr[j]);
            } else {
                map.put(arr[j],freq-1);
            }
            i++;
            j++;
            
        }
        return list;
    }
    public static void main(String[] args) {
        int N = 7, K = 4;
        int A[] = {1,2,1,3,4,2,3} ; 
        System.out.println(distinctElemets(A,N,K));
    }
}
