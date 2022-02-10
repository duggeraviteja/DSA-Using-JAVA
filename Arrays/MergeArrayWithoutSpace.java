import java.util.*;
class MergeArrayWithoutSpace
{
    //Function to merge the arrays.
    public  void merge() 
    {
      

        long  arr1[] = {1,3,5,7};
     
        long arr2[] ={0,2,6,8,9};
        int n=arr1.length;
        int m=arr2.length;

        int i=n-1;
        int j=0;

        while(i >=0 && j < m){
            if(arr1[i] > arr2[j]){
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1) +" "+ Arrays.toString(arr2));
    


    }
 
      

    public static void main(String[] args) {
     
        MergeArrayWithoutSpace obj =new MergeArrayWithoutSpace();
        obj.merge();




    }
}