import java.util.*;
public class HappyNumber {

    static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Arrays.sort(arr);


       for(int i:arr){
           System.out.print(i + " ");
       }
	   
	   int temp = arr[0];
	   //int val=0;
	   for(int i=0;i<N;i++){
	       
	       if(temp== arr[i] ) {
	       

            if(temp+1 ==  arr[i])
            {

            }
	       } else {
	           break;
	       }
	       
	       
	   }
	   return temp-1;
    }


    // public static int isHappyNumber(int num){  
    //     int rem = 0, sum = 0;  
          
    //     //Calculates the sum of squares of digits  
    //     while(num > 0){  
    //         rem = num%10;  
    //         sum = sum + (rem*rem);  
    //         num = num/10;  
    //     }  
    //     return sum;  
    // }  
      
    public static void main(String[] args) {  
        int num = 3;  
        int result = num;  
          
    //     while(result != 1 && result != 4){  
    //         result = isHappyNumber(result);  
    //     }  
          
    //     //Happy number always ends with 1  
    //     if(result == 1)  
    //         System.out.println(num + " is a happy number");  
    //     //Unhappy number ends in a cycle of repeating numbers which contains 4  
    //     else if(result == 4)  
    //         System.out.println(num + " is not a happy number");     
    // }  


  int arr[] =   {6, 6, 2, 3, 1,4, 1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6};
  int n= arr.length;



System.out.println(findLongestConseqSubseq(arr,n));


    }

	}

