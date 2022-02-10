
public class Different_Numbers {

  static void AutomarphicNumber(){
        //A number is called an automorphic number if and only if the square of the given number ends with the same number itself.
        // For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits
        // of the square represent the number itself. Some other automorphic numbers are 5, 6, 36, 890625, etc.
    int n=25;
    int sq = n*n;
    int rem = 0;
   
   rem = sq %100; 
   
   String res = (n==rem) ? "True " : " False";
    //System.out.print(n);
    System.out.print(res);
    
    }

    static void PetersonNumber() {
        //A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.

        int n = 145,rem = 0,fact=0,sum=0;
        while(n>0){
            rem = n%10;
                fact=1;
            for(int i=rem;i>0;i--){
                fact = fact*i;
            }
            sum+=fact;
            n=n/10;
        }
        n=145;
        System.out.println( (n == sum) ? "True " : "False");
    }

    static void SunnyNumber() { 
        int n=87;
        int m=n+1;
        int res = (int)Math.sqrt(m);
        System.out.println(res);
    }
    public static void main(String[] args) {
      //  Different_Numbers.AutomarphicNumber();
       PetersonNumber();
        SunnyNumber();
    }
}
