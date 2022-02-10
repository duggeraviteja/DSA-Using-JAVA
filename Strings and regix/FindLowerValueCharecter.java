
import java.util.*;
public class FindLowerValueCharecter {
   static char minCharacter(String s , int len) {
       char min = 'z';
       for (int i = 0; i <len; i++) {
           if(s.charAt(i) < min){
               min = s.charAt(i);
           }
       }
       return min;
    }
    public static char maxCharacter(String name,int len){
        int greatestVal = 0;

        for (int i = 0; i < name.length(); i++)
        {
            int curVal = (int)name.charAt(i);
            if(curVal > greatestVal)
                greatestVal = curVal;
        }
        char asChar = (char)greatestVal;
        return asChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String s1 = "raZiteja";
    int length = s1.length();
    System.out.println(minCharacter(s1,length));
    System.out.println(maxCharacter(s1,length));

   


                  
        int [][]ar = new int [3][4];
  
        // Fill each row with 10. 
        for (int[] row : ar)
            Arrays.fill(row, 10);
     
        System.out.println(Arrays.deepToString(ar));

        int a[][] =new int[4][5];
        System.out.println(Arrays.deepToString(a));


        for(int i = 0; i <= 255; i++)  
{  
System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
}  

    }
    
}   
