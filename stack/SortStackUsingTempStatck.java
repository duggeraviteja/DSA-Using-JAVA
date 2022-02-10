import java.util.*;
import java.lang.*;

public class SortStackUsingTempStatck {

    static Stack<Integer> sort( Stack<Integer> input){
        Stack<Integer> s = new Stack<>();
        Collections.reverse(input);

        Collections.sort(input,Collections.reverseOrder());

        

        return input;

    }

public static void main(String[] args) {
    Stack<Integer> input = new Stack<Integer>();
    input.add(34);
    input.add(3);
    input.add(31);
    input.add(98);
    input.add(92);
    input.add(23);

    System.out.println("normal list : "+input);
    System.out.println(sort(input));


    
}

}
