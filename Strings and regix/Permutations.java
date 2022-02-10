import java.util.*;

public class Permutations {

    static void printPermuatations(String s, String ans) {

        if (s.length() == 0) {
            System.out.println(ans + " ");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            String ros = s.substring(0, i) + s.substring(i + 1);
            printPermuatations(ros, ans + a);
        }
    }

    static void AnotherSolution(String s){

        int n = s.length();
        int f = fact(n);
        for (int i = 0; i < f; i++) {
            StringBuilder sb = new StringBuilder(s);
            int temp=i;
            for (int j = n; j >=1; j--) { 
                int q = temp / j;
                int r = temp % j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }

    }

    static int fact(int n){
        int val=1;
        for (int i = 2; i <=n; i++) {
            val *=i;
        }
        return val;
    }

    public static void main(String[] args) {
        String s = "abc";
       // printPermuatations(s, "");
        AnotherSolution(s);
    }
}
