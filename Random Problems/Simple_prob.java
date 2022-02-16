public class Simple_prob {


    static int armStrongNumber(int n){
        int sum =0;
        while(n!=0){
            int lastDigit = n%10;
             sum = sum + (lastDigit*lastDigit*lastDigit);
            n =n/10;
        }
  return sum;
    }

    static int sumOfDigits(int n){
        int res=0;
        while(n!=0){
            int lastDigit = n%10;
             res = res + lastDigit;
            n =n/10;
        }
        return res;
    }

      public static void main(String[] args) {

        // ArmStrong Number
        int n =153;
        int res = armStrongNumber(n);
        if(n == res){
            System.out.println(n+ " : value is armStrong number");
        } else {
            System.out.println(n + " : Not a armStrong Number");
        }

                     
        System.out.println(sumOfDigits(11111));
    }
}
