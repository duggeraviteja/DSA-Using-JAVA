public class Pattern_test {

    public static void main(String[] args) {
        int row = 5;
        int m = 1;
        int k;

        for (int i = 0; i < row; i++) {

            // below to loops for star printing 

            for (int j = row - i; j > 0; j--) {

                System.out.print(" ");
            }

            for (k = 0; k <= i; k++) {

                System.out.print("*");
            }
            m = k;
            //space between * and Number
            System.out.print(" ");
            //loop for number
            for (int y = 0; y <= i; y++) {
                System.out.print(m++);
            }
            System.out.println();
        }

        int n = 1;
        int g = 1;

        for (int p = 0; p < row; p++) {

            for (int q = 0; q <= p; q++) {
                System.out.print(" ");
            }

            for (int r = row; r > p; r--) {
                System.out.print(+r);
            }
            System.out.print(" ");
            n = g;
            for (int s = row; s >= p + 1; s--) {
                System.out.print(+n);
                n = n + 2;
            }
            g = g + 2;

            System.out.println();
        }

    }
}