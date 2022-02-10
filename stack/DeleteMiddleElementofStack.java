//package stack;
import java.util.*;
public class DeleteMiddleElementofStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        int curr =0;
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);
       

         int n= s.size();

         int a = (int)Math.ceil(n/2);

         s.remove(a);
        // int x= s.pop();
        
        // for (int i = 0; i <n; i++) {

        // if(curr != n/2 ){
        //     curr++;
        //     s.push(x);
           
        // }            
        // }


        System.out.println(s);

    }
}
