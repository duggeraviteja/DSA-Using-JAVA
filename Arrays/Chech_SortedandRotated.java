public class Chech_SortedandRotated {

    //Function to check if array is sorted in increasing order and rotated.
static boolean IA(int arr[],int n){
    int  i=0;

    while(i<n-1 && arr[i] <=arr[i+1]){
        i++;
    }

    if (i == n - 1) return false;

    i++;
    while(i<n-1 && arr[i]<=arr[i+1]){
        i++;
    }

    return  (i== n-1 && arr[n-1] <= arr[0])? true : false;
}

static boolean DA(int[] arr, int n ){
    int i=0;
    while(i < n-1 && arr[i] >= arr[i+1]){
        i++;
    }

    if (i == n - 1) return false;

    i++;
    while(i< n-1 && arr[i] >= arr[i+1]){
        i++;
    }
    return (i==n-1 && arr[n-1] >= arr[0]) ? true : false;
}

  static boolean checkfoSorted_Rotated(int arr[],int n){
      return IA(arr,n)|| DA(arr,n);
  }
     public static void main(String[] args) {
        int[]  a = {3,4,1,2};

        boolean status = checkfoSorted_Rotated(a,a.length);
        System.out.println((status) ? "Yes" : "No");
    }
}
