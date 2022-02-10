import java.util.Stack;

public class PostfixToPrefix {

    static String postopre(String exp){  

        Stack<String> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(c + "");
            }
            else {
                String s1 = st.pop();
                String s2 = st.pop();
                String res = c+s2+s1;
                st.push(res);
            }
        }

        // String ans = "";
        // for (String i : st)
        //     ans += i;    
        return st.pop();
    }

    public static void main(String[] args) {
        String exp = "ABC/-AK/L-*";
         String exp0 = "AB+CD-*";


     System.out.println(postopre(exp0));
    }
}
