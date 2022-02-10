import java.util.Stack;

public class PrefixtoPostfix {
 
    
 void pretopost(String exp){
     Stack<String> st = new Stack<>();
     for (int i = exp.length()-1; i >= 0; --i) {
         char c=exp.charAt(i);

         if(Character.isLetterOrDigit(c)){
            st.push(c + "");
         } else {
            //  String v1 =st.pop();
            //  String v2 = st.pop();



             String op1 = st.peek();
                st.pop();
                String op2 = st.peek();
                st.pop();

            String temp = op1 + op2 + c;

            //  String res = v1+v2+c;
             st.push(temp);
         }
     }

     System.out.println(st.peek());
 }



 public static void main(String[] args) {
     PrefixtoPostfix obj = new PrefixtoPostfix();
     String a="*-A/BC-/AKLc";
     String b= "*+AB-CD";
     obj.pretopost(a);
     obj.pretopost(b);

 }

}
