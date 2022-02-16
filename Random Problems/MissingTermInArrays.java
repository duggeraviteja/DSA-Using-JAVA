
import  java.util.*;

public class MissingTermInArrays {

    
    static ArrayList<Long>  findMissing(long a[], long b[],  int N, int M){ 
       
        HashSet<Long> s = new HashSet<>(); 
        ArrayList<Long> ans = new ArrayList<>();
        for (int i = 0; i < M; i++) 
            s.add(b[i]); 
      
    
        for (int i = 0; i < N; i++) 
            if (!s.contains(a[i])) 
                ans.add(a[i]);
        return ans;
    }
        public static void main(String[] args) {
            long A[] = {1, 2, 3, 4, 5, 10};
           long B[] = {2, 3, 1, 0,12,15, 5};
            int n=A.length;
            int m =B.length;

            System.out.println(findMissing(A, B, n, m));
        
        
    } 
}
