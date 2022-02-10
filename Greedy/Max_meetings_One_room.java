import java.util.*;

class A {
    int s;
    int e;
  A(int s,int e){
      this.s =s ;
      this.e = e;
  }  
}

public class Max_meetings_One_room {

    public static void main(String[] args) {
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };  


        A arr[] = new A[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = new A(s[i], f[i]);
        }



        Arrays.sort(arr, new Comparator<A>() {
            public int compare(A a1 , A a2){
                return a1.e - a2.e;
            }
        });

        for (A a : arr) {
            System.out.println(a.s +" = "+a.e);
        }

        int prev = arr[0].e;
        int res=0;

        for(int i = 1; i < s.length ; i++){
            if ( arr[i].s > prev){
                res++;
                prev = arr[i].e;
            }
        }

        System.out.println(res);
       
    }
}
