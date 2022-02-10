import java.util.Arrays;
import java.util.*;

public class Buy_Min_Max_CandyfromStore {

    static void Solution(int []arr,int k){

        ArrayList<Integer> res=new ArrayList<>();
        
        Arrays.sort(arr);
        int N = arr.length;
        int min=0;
        int max=0;
        int j=arr.length-1;;
        for(int i=0;i<=j;i++)
        {
            min+=arr[i];
            j=j-k;
        }
        
        j=0;
        for(int i=N-1;i>=j;i--)
        {
            max+=arr[i];
            j=j+k;
        }
        
        res.add(min);
        res.add(max);

        System.out.println(res);

    }
    public static void main(String[] args) {
        int N = 4;
        int K = 2;
        int candies[] = {3, 2 ,1 ,4};

    // Solution(candies,K);



     System.out.println(Math.ceil(11/3));
    }
    
}
