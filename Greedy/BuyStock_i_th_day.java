import java.util.Arrays;
import java.util.Comparator;

class Pair{
    int stock;
    int day;
    Pair(int stock,int day) {
        this.stock = stock;
        this.day = day;
    }
}

public class BuyStock_i_th_day {


    static int maximizeStocks(int[] price,int k){
        int ans = 0;

        Pair[]  arr = new Pair[price.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Pair(price[i] , i+1);
        }

        Arrays.sort(arr,new Comparator<Pair>() {
            public int compare(Pair a,Pair b){
                return a.stock - b.stock;
            }
            
        });

        for (int i = 0; i < arr.length; i++) {
            ans += Math.min(arr[i].day,k/arr[i].stock);
             k -= arr[i].stock * Math.min(arr[i].day,k/arr[i].stock);
        }
        return ans;
    }

    public static void main(String[] args) {

       int price[] = { 7, 10, 4 }; 
        int k = 100;

        System.out.println(maximizeStocks(price,k));
        
    }
}





// In a stock market, there is a product with its infinite stocks. 
// The stock prices are given for N days, where arr[i] denotes the price of the stock on the ith day. 
// There is a rule that a customer can buy at most i stock on the ith day. 
// If the customer has an amount of k amount of money initially,
//  find out the maximum number of stocks a customer can buy. 

// For example, for 3 days the price of a stock is given as 7, 10, 4.
//  You can buy 1 stock worth 7 rs on day 1, 2 stocks worth 10 rs each 
//  on day 2 and 3 stock worth 4 rs each on day 3.