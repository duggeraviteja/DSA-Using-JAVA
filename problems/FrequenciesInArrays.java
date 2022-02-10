

public class FrequenciesInArrays {
    
    public  static int frequencycount(int arr[], int n)
    {
    int k=1;
     
        for(int i=1;i<=n;i++){
              int count = 0;
          
            //int freq=arr[i-1];
            for(int j=0;j<n;j++){
                
                if(k == arr[j]){

                  count=count+1;
                }
                 
            }
             arr[i-1]= count;
             k++;
        
    }

    for(int i:arr){
        System.out.print(i + "  ");
    }
return 0;

}





    public static void main(String[] args) {
      int  n = 5;
       int  A[] = {2,3,2,3,5};
    System.out.print(frequencycount(A,n));




}     
 

    
}
