import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        if(a.length() != b.length()){
            return false;
        }
        
        String s1 = a.toLowerCase().trim();
        String s2 = b.toLowerCase().trim(); 

         boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
             status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
       

        return status ?true :false;
           
    }
    public static void main(String[] args) {

        String a = "anagram";
        String b = "margana";

        Pattern p = Pattern.compile(a);
        Matcher m = p.matcher(b);
        boolean matchFound = m.find();
        System.out.println(matchFound);

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );



  
    }
}
