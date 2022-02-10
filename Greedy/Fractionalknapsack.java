import java.util.*;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class Fractionalknapsack {
    static double f_knapsack(int W, Item arr[], int n) {
        double result = 0.0;
        Arrays.sort(arr, new Comparator<Item>() {
            public int compare(Item s1, Item s2) {
                return s2.value * s1.weight - s2.weight * s1.value;
            }

           
        });




        for (int i = 0; i < n; i++) {
            if (W > arr[i].weight) {
                result += arr[i].value;
                W = W - arr[i].weight;
            } else {  
                result += (((double) W * (double) arr[i].value) / ((double) arr[i].weight));
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int N = 3, W = 50;
        int values[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };

        Item[] arr = new Item[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Item(weight[i], values[i]);
        }

        System.out.println(f_knapsack(W, arr, N));

    }
}
