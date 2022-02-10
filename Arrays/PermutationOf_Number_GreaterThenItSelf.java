import java.util.*;


public class PermutationOf_Number_GreaterThenItSelf {


    static void permuate(List<Character> list, int n,int org){
        if(n == 1) {
            StringBuilder sb = new StringBuilder();
            
             for (Character ch : list) {
                sb.append(ch);
            }
            String s = sb.toString();

            int val = Integer.parseInt(s);
            if(val > org) {
                System.out.println(val);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            permuate(list, n-1,org);

            if(n%2 ==  1) {
                Collections.swap(list, 0, n-1);
            } else {
                Collections.swap(list, i, n-1);
            }
        }

    }


    static void permuations(int n) {
        int orig = n;
        String s= Integer.toString(n);

        List<Character> list =new  ArrayList<>();

        for(char i=0;i<s.length();i++) {
            list.add(s.charAt(i));
        }
        

        permuate(list, list.size(),orig);

        

        
    }
    public static void main(String[] args) {
        int n = 324;
        permuations(n);
    }
}
