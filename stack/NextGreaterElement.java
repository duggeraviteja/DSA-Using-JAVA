import java.util.*;

public class NextGreaterElement {
    

    static void nextElement(int array[],int query[]){

        Stack<Integer> st = new Stack<>();
        int max =0,j=0;

        for (int i = 0; i < array.length; i++) {
            

            max =query[j];
            j++;
            if(array[max] < array[max+i]){
                st.push(array[max+i]);
                break;
            } 
            else {continue;}
           
        }

            System.out.println(st);
        

    }
    public static void main(String[] args) {
        int array[] = {3, 4, 2, 7,5, 8, 10, 6};
        int query[] = {3, 6, 1};

        nextElement(array,query);
    }
    
}
