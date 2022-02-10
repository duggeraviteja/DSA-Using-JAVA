import java.util.*;
class LongestConsectiveSequence{

    static int Ans(int[] arr,int n){

        Arrays.sort(arr);
	   int max=0,count=0;
	   
	   for(int i=0;i<n-1;i++){
	       if(arr[i] == arr[i+1]){
	           continue;
	       }
	       if(arr[i] == arr[i+1]-1){
	           count++;
	           max=Math.max(max,count);
	       }
	       else{
	           count=0;
	       }
	   }
	   
	   return max+1;
	   
    }
    public static void main(String[] args) {

        int arr[] = {2,6,1,9,4,5,3};
        System.out.println(Ans(arr,arr.length));

    }
}