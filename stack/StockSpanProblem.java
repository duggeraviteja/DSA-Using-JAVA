import java.util.*;
import java.util.Arrays;


class StockSpanProblem 
{

void stockSpan(int arr[],int n,int span[]){

span[0]=1;

        for (int i = 1; i < n; i++) {
        {
                span[i]=1;

            for (int j = i - 1; (j >= 0) && (arr[i] >= arr[j]); j--)

                        span[i]++;
                    }
}
        // System.out.print(Arrays.toString(span));

Arrays.stream(arr).forEach(System.out::println);  

 System.out.print("-----***************------------\n");

// 

        Arrays.stream(span).forEach(games -> System.out.println(games));  



        // Arrays.stream(span).forEach( e ->  System.out.println(e););




// for(int i:span)
// System.out.println(i);


}

public static void main(String[] args) {
    StockSpanProblem obj = new StockSpanProblem();

     int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];
 
    obj.stockSpan(price,n,S);

            

}


}