import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubseqenceOfStrings {
    static ArrayList<String>  list = new ArrayList<>();
    static void getSubseqence(String s ,String ans) {
        if(s.length() == 0) {
            list.add(ans);
            return;
        }

        char cur = s.charAt(0);

        String second = s.substring(1);

        getSubseqence(second, ans);   // Excluding first character
        getSubseqence(second, ans+cur); // Including first characte

    }

    public static ArrayList<String> getSequence(String str)
    {
 
        if (str.length() == 0) {
             ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
         char ch = str.charAt(0);

        String subStr = str.substring(1);
 
        ArrayList<String> subSequences = getSequence(subStr);

        ArrayList<String> res = new ArrayList<>();

        for (String val : subSequences) {
            res.add(val);
            res.add(ch + val);
        }
 
        return res;
    }

    public static void main(String[] args) {
        String s = "abc";
        getSubseqence(s ,"");

        list.remove(""); // removing empty string
        System.out.println(list);



       // System.out.println(getSequence(s));



        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j <=3; j++) {
                System.out.println(s.substring(i,j));  
            }
        }



    }

}
