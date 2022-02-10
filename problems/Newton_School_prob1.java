import java.util.Scanner;
import java.util.*;

class Newton_School_prob1 {

    public static String sortString(String inputString) {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        char[] b = new char[k];
        int[] bb = new int[n];

        // a=97
        for (int i = 0; i < n / k; i++) {
            for (int j = 0; j < k; j++) {

                if (k <= 26) {
                    char ch = (char) ('a' + j % k);
                    System.out.print(ch);
                } else {

                    b[j] = (char) ('a' + (j % k) % 26);
                    // k=27
                    String string = new String();
                    String outputString = sortString(string);

                    System.out.print(b[j]);

                }
            }
        }

    }
}

// // you can add inner classes if needed
// class Main {
// public static void main (String[] args) {
// // Your code here
// Scanner sc=new Scanner(System.in);
// char c=sc.next().charAt(0);
// char v=sc.next().charAt(0);
// if(c=='R' || v=='R')
// System.out.println("R");
// else if(c=='J')
// System.out.println(v);
// else if(v=='J')
// System.out.println(c);
// else
// System.out.println("D"); }
// }