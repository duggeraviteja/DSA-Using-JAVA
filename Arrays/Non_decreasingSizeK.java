import java.util.*;
public class Non_decreasingSizeK {
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void reverse(int arr[],int start,int end) {
        while(start < end){
            swap(arr,start++,end--);
        }
    }

    static int count(int n)
    {
        if(n == 0)
            return 1;
        
            return (n * count(n - 1));
                        
    }
   static int getLds(int[] arr){
       int n=arr.length;

    int lis[] = new int[n];
    int i, j, max = 0;

    for (i = 0; i < n; i++)
        lis[i] = 1;

  
    for (i = 1; i < n; i++)
        for (j = 0; j < i; j++)
            if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                lis[i] = lis[j] + 1;

    /* Pick maximum of all LIS values */
    for (i = 0; i < n; i++)
        if (max < lis[i])
            max = lis[i];

    return max;
   }
    public static void main(String[] args) {
        int arr[] = {2,2, 3};
        int m=1;
        int res[] = new int[arr.length];

        int n =arr.length;
        List<Integer> list = new ArrayList<>();
    
      
        int fact = count(n);

        for (int p = 1; p <=2; p++) {
            
    
           
            
            int i=arr.length-2;
            
            while(i>=0 && arr[i] >= arr[i+1]){
                i--;
            }
            if(i>=0){
                int j= arr.length-1;
                while(arr[j] <= arr[i]){
                    j--;
                }
                swap(arr,i,j);
            }
            
            
            reverse(arr,i+1,arr.length-1);
            
            
        System.out.println(Arrays.toString(arr));
         int ans = getLds(arr);

         if(ans == m){

            // for (int j = 0; j < arr.length; j++) {
            //     res[i] =arr[i];
            // }
             for(int q:arr){
                 list.add(q);
             }
         }
            

        }

        if(list.isEmpty()){
           System.out.println(-1);
        } else {
            System.out.println(list);
        }
            
     //   System.out.println(Arrays.toString(res));

    }
}
