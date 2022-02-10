public class NextPermutations {
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
    

    static void next_Permutation(int arr[],int n){
        int i=arr.length-2;
            
        while(i>=0 && arr[i+1] <= arr[i]){
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
        
      

    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 1};
        next_Permutation(arr,arr.length);

        for(int k:arr){
            System.out.print(k +" ");
        }
    }
}
