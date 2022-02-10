import java.util.*;

class ReverseWords {
   static String reverseWords(String S) {
        // code here


//easy way---->


        // String words[] = s.split("\\.");
        // String result = "";

        // for (int i = words.length - 1; i >= 0; i--) {
        //     result += words[i];
        //     if(i!=0)
        //         result += '.';
        // }
        // return result;








String s[] =S.split("\\.");

        String ans = "";
        for (int i = s.length - 1; i >= 0; i--)
        {
            ans += s[i] + ".";
        }
        System.out.println("orignal String: " + ans);

        System.out.println("Reversed String:");
        

       return ans.substring(0, ans.length() - 1);

        //return ans;
    }

    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println( reverseWords(s));


    }
}