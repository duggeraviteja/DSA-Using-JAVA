import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class PermutationsOfString {

  static  ArrayList<String> list = new ArrayList<>();
    static void permuations(String s,String perm) {
        if(s.length() ==  0 ) {
            list.add(perm);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
        char cur = s.charAt(i);
        // left  + right
        String newStr = s.substring(0, i) + s.substring(i+1);
        permuations(newStr, perm+cur);

       
      //  System.out.println("  ======= ");
        }
    }
    public static void main(String[] args) {
        
        String s = "whr";
        permuations(s, "");

        Collections.sort(list);
        System.out.println(list);
    }
}
