import java.util.*;
import java.lang.*;
import java.util.Scanner;
public class Exercise2 {

  static int binarySearch(int arr[], int first, int last, int key)
    {
        int mid = (first + last)/2;  
        while( first <= last ){  
           if ( arr[mid] < key ){  
             first = mid + 1;     
           }else if ( arr[mid] == key ){  
             return mid;  
              
           }else{  
              last = mid - 1;  
           }  
           mid = (first + last)/2;  
        }  
        if ( first > last ){  
            return -1;
        } 
        return 0;
}

    public static void main(String[] args) {

        int arr[] = new int[100];
        for (int i = 0; i < 100; i++) {
            Random random = new Random();   
            // Generates random integers 0 to 99 
            int x = random.nextInt(100); 
            arr[i]=x;
        }

        System.out.println("Contents of the Array :");
        for (int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println(" \n Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int n = arr.length;
        int result = binarySearch(arr,0,n, value);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);



        
        
            String array[] =new String[10];
            String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "abcdefghijklmnopqrstuvxyz";
            Random random = new Random(); 
            for (int i = 0; i < array.length; i++) {
                
            int x = random.nextInt(10); 
            StringBuilder sb = new StringBuilder(x);
            for (int j = 0; j < x; j++) {
                int index = (int)(str.length() * Math.random());
                sb.append(str.charAt(index));
            }

          
            String y = sb.toString();

                array[i]=y;

            }

            for (String i : array) {
                System.out.print(i + " ");
            }
            
           


    }

    
}
