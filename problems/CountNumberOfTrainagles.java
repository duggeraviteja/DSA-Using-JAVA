//package problems;
import java.util.*;
public class CountNumberOfTrainagles {
void counTraingles(int arr[]){
    Arrays.sort(arr);
    int count =0;
    for (int i = 0; i < arr.length-2; i++) {
         int k=i+2;
         for (int j = i+1; j < arr.length; j++) {
             
            while(k < arr.length && arr[i]+arr[j] > arr[k]) {
                k++;
            }
            if(k>j){
                count += k-j-1;
            }

         }
        
    }

    System.out.println(count);
}


static int anotherway(int arr[]){


    Arrays.sort(arr);
    int n=arr.length;

    int count =0;
for (int i = n-1; i >=1; i--) {

    int l=0,r=i-1;
    while(r>l){
        if(arr[l]+arr[r] > arr[i]){
            count+=r-l;
            r--;
        }
        else {
            l++;
        }
    }    
}

return count;
}



    public static void main(String[] args) {
        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        int arr2[] = {2,3,4,5};
        CountNumberOfTrainagles obj =new CountNumberOfTrainagles();


        obj.counTraingles(arr2);
        System.out.println(anotherway(arr));



    }
    
}
