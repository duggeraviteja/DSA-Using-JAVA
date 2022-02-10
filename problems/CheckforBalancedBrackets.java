import java.util.Stack;

public class CheckforBalancedBrackets {
   static boolean balancedBrackets(String brac){
        Stack<Character> st =new Stack<>();
        
        for (int j = 0; j < brac.length(); j++) {

            char c= brac.charAt(j);

            if(c == '(' || c == '{' || c =='[') {
                st.push(c);
                continue;

            }
            if (st.isEmpty())
            return false;

            char temp;
            switch (c) {
                case ')':
                    temp =st.pop();
                    if(temp == '{' || temp=='['){
                        return false;
                    }
                    break;
                    case '}':
                    temp =st.pop();
                    if(temp == '(' || temp=='['){
                        return false;
                    }
                    break;
                    case ']':
                    temp =st.pop();
                    if(temp == '{' || temp=='('){
                        return false;
                    }
                    break;
            
                default:
                    break;
            }

            
        }
        return (st.isEmpty());
    }

    public static void main(String[] args) {

        String expr = "([{}])";


        if (balancedBrackets(expr))
        System.out.println("Balanced");
        else
        System.out.println("Not Balanced ");

        int i=07;
        System.out.println(i);
    }
}
