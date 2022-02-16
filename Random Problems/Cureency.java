
import java.util.*;

import java.text.NumberFormat;

public class Cureency {

    public static void main(String[] args) {
     //   Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to be converted : ");
      //  double payment = scanner.nextDouble();
      double payment = 1000_228.4745;

        // Write your code here.
        try {
            String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);

            // String india =
            // NumberFormat.getCurrencyInstance(Locale.INDIA).format(payment);

            String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);

            String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

            String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
            String canada = NumberFormat.getCurrencyInstance(Locale.CANADA).format(payment);
            String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(payment);


            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
            System.out.println("Canada: " + canada);
            System.out.println("Uk: " + uk);



        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
