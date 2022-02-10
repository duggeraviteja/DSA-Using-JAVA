import java.util.Collections;
import java.util.*;

public class MincostToCutBoardIntoSquares {

  static int minimumCostOfBreaking(Integer[] X,Integer[] Y, int m,int n) {


    Arrays.sort(X,(a,b)->b-a);
    Arrays.sort(Y,(a,b)->b-a);

    int horizental  = 1, vertical = 1;
    int i = 0, j = 0,res=0;

    while(i<m && j<n){
        if(X[i] > Y[j] ){
            res += X[i] * vertical;
            horizental++;
            i++;
        } else {
            res +=Y[j] * horizental;
            vertical++;
            j++;
        }
    }


    // remaining elemts 

    int total = 0;
    while (i < m) {
        total += X[i++];
    }
    res += total * vertical;
  
    // loop for vertical array, 
    // if remains
    total = 0;
    while (j < n) {
        total += Y[j++];
    }
    res += total * horizental;
  
    return res;
  }

    public static void main(String[] args) {
        
        int m = 6, n = 4;
        Integer X[] = {2, 1, 3, 1, 4};
        Integer Y[] = {4, 1, 2};
        System.out.print(minimumCostOfBreaking(X, Y, m-1, n-1));
    }
}
