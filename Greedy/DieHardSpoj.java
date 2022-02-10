import java.util.*;
public class DieHardSpoj {

    static int survive(int h,int arm){

        int count = 0;
        while(true) {
            if(count %2 == 0) { 
                h  +=3;
                arm +=2;
            } else {
                if(arm> 10){
                    h -= 5;
                    arm -=10;
                } else {
                    h -= 20;
                    arm +=5;
                }
            }

            if(h > 0 && arm > 0){
                count++;
            }  else {
                break;
            }


        }

        return count;
        
    }
    public static void main(String[] args) {
        int h = 20;
        int arm  = 8;

        int ans = survive(h, arm);

        System.out.println(ans);
    }
}
