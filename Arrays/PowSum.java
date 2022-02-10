import java.lang.*;
import java.util.List;
import java.io.*;
import java.util.*;

class PowSum
{
    public static int power(int p)
    {
       p=p-1;
       while((p&p-1)!=0)
       {
           p=p&p-1;
       }
       return p<<1;
    }
public static void main (String[] args) throws java.lang.Exception
{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
  {
      int n=sc.nextInt();
      int arr[]=new int[n];
      int sum = 0;

    for(int i=0;i<n;i++)
    {
       arr[i]=sc.nextInt();
       sum = sum + arr[i];
    }
    
    int arr2[] = new int[n];
    arr2 =  arr.clone();
    
    Arrays.sort(arr2);

   int pow = power(sum);
   int min=arr2[0];

    sum = sum - min;
    int ans=sum;
   int count =(pow-sum)/min;

    if(count==1)
    System.out.println("0");
    else{
    System.out.println("1");
    System.out.println("1 "+ count );

    int index = Arrays.binarySearch(arr,min);
    
    System.out.println(index+1);
     }
  }
 }
}