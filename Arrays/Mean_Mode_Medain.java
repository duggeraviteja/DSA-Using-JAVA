import java.util.*;

public class Mean_Mode_Medain {

    // mean 
    static void mean(int a[]){
       float mean =0.0f;
       for (int i=0;i<a.length;++i) {
           mean += a[i];
        }
       
        System.out.printf("Mean : %.3f \n",mean/a.length);
    }


    static void mode(int a[]){
        int max =0,res=0;
        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j < a.length; j++) {
                if(a[j] == a[i]){
                    count++;
                }
            }
            if(count > max){
                max =count;
                res = a[i];
            }
        }
        System.out.println("Mode : "+res);
     }

    // mode 

    static void median(int a[]){
        float res = 0.0f;
       int n = a.length;

        if(a.length % 2 != 0){
            res = a[n/2];
        } else {
            res = (a[(n - 1) / 2] + a[n / 2]) / 2.0f ;
        }
        System.out.println("Median : "+res);
    }
    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 2, 7, 2, 5,2, 8, 6 };
        mean(a);
        mode(a);
       median(a);

        
    }
}
