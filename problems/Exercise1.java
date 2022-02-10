
import java.util.*;
public class Exercise1 {

    public static ArrayList<Integer> removeDuplicatesInteger(ArrayList<Integer> list) {

        HashSet<Integer> set = new HashSet<>(list);
        //converting set to new list
        ArrayList<Integer> newlist = new ArrayList<>(set);

        return newlist;
    }

    public static ArrayList<Character> removeDuplicatesChar(ArrayList<Character> charlist) {

        HashSet<Character> set = new HashSet<>(charlist);
        //converting set to new list
        ArrayList<Character> newlist = new ArrayList<>(set);
        System.out.println("------"+set +"\n==");

        return newlist;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(100);


        for (int i = 0; i < 100; i++) {
            Random random = new Random();   
            // Generates random integers 0 to 9  
            int x = random.nextInt(10); 
            list.add(x);
        }
        System.out.println("Contents of Integer ArrayList :" +list);

        ArrayList<Integer> newList = removeDuplicatesInteger(list);
        System.out.println("New ArrayList :" +newList);


        ArrayList<Character> charlist = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            char x =(char)('a' + Math.random() * 26);
            charlist.add(x);
        }
        System.out.println( "Contents of Character ArrayList :"+ charlist);

        ArrayList<Character> char_newList = removeDuplicatesChar(charlist);
        System.out.println("New ArrayList :" +char_newList);
       
        
      
    }
}
