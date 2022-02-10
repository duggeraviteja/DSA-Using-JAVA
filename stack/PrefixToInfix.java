import java.util.Stack;

public class PrefixToInfix {


    boolean isOperator(char c){
        switch(c){
            case '+':
            case '-':
            case '*':
            case '/':
             return true;
        }
        return false;
    }
    
    String preToIn(String exp){
        Stack<String> st = new Stack<>();

        for(int i=exp.length()-1;i>=0;i--){
            char c = exp.charAt(i);
            
            if(isOperator(c)){
                String s1 = st.pop();
                String s2 = st.pop();
                String res = "("+s1+c+s2 + ")";
                st.push(res);
            }
            else {
                st.push(c + "");
             }
        }
        return st.pop();
    }

  public static void main(String[] args) {
      PrefixToInfix obj = new PrefixToInfix();
      
    String exp = "*-A/BC-/AKL";
      System.out.println(obj.preToIn(exp));
    }
}
