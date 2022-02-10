import java.util.ArrayList;
import java.util.Collections;

public class GenereateAllPermutations {
   static int count=0;

    static void permuate(ArrayList<Integer> list, int n){
        if(n == 1) {
            System.out.println(list);
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            permuate(list, n-1);

            if(n%2 ==  1) {
                Collections.swap(list, 0, n-1);
            } else {
                Collections.swap(list, i, n-1);
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
      

      permuate(list,list.size());
        System.out.println(count);

    }
}
