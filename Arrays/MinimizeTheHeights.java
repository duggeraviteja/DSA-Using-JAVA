import java.util.Arrays;

public class MinimizeTheHeights {
  static int miniMize(int[] arr ,int k){
      Arrays.sort(arr);

      int max = arr[arr.length-1];
      int min = arr[0];
      int res = max-min;
      int n = arr.length;
      for (int i = 1; i < arr.length; i++) {
          if(arr[i] >= k){
              max = Math.max(arr[i-1]+k, arr[n-1]-k);
              min = Math.min(arr[0]+k, arr[i]-k);
              res = Math.min(res,max-min);
          }
           
      }
      

      return res;
  }



  static int getMinDiff(int[] arr, int k) {
      int n=arr.length;
    Arrays.sort(arr);
    int ans = arr[n-1] - arr[0];
    int smallest = arr[0] + k, largest = arr[n-1]-k;
    for(int i = 0; i < n-1; i++){
        int min = Math.min(smallest, arr[i+1]-k);
        int max = Math.max(largest, arr[i]+k);
        if(min < 0) 
            continue;
        ans = Math.min(ans, max-min);
    }
    return ans;
}
    public static void main(String[] args) {
        int arr[] ={3, 9, 12, 16, 20};
        int k=2;

        System.out.println(miniMize(arr,k));
        System.out.println(getMinDiff(arr,k));

    }
    
}
