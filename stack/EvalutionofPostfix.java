import java.util.*;
import java.util.Scanner;


public class EvalutionofPostfix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        String exp = sc.next();


        Stack<Integer> st = new Stack<>();

            for(int i=0;i<exp.length();i++){
                char c=exp.charAt(i);
                    if(Character.isDigit(c)){
                        st.push(c - '0');
        }
        else {
            int v1=st.pop();
            int v2 = st.pop();
            switch (c) {
                case '+':st.push(v1+v2);
                    break;
                case '-':st.push(v2-v1);
                     break;
                case '*':st.push(v1*v2);
                    break;
                case '/':st.push(v2/v1);
                    break;
            
                default:
                    break;
            }
                
        }
       
    }
    System.out.println(st.pop());

    }
}
