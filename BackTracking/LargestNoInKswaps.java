import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class LargestNoInKswaps {

    public static String findMaximumNum(String str, int k) {

        String ans = "";

        char[] arr = str.toCharArray();

        Character[] ob = new Character[arr.length];

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
            ob[i] = str.charAt(i);
        }

        Arrays.sort(ob, Collections.reverseOrder());

       // System.out.println("== " + Arrays.toString(ob));

        for (int i = 0; i < k; i++) {

        int index = Arrays.binarySearch(arr,ob[i]);
        ob[index] = 0;
        Collections.swap(list, i, index);


      
        }

        System.out.print(list);

        return ans;

    }

    public static void main(String[] args) {
        int K = 3;
        String str = "3435335";
        System.out.println(findMaximumNum(str, K));
    }

}
