public class PlaceTiles {
    static int placeTiles(int n,int m)  {
        if(n == m) {
            return 2;
        }
         if( n< m) {
             return 1;
         }

         int vertical = placeTiles(n-m, m);
         System.out.println("vertical=="+vertical);
         int horizental = placeTiles(n-1, m);
         System.out.println("horizental=="+horizental);

         return vertical + horizental;
    }
    public static void main(String[] args) {
        System.out.println(placeTiles(4,2));
    }
}
