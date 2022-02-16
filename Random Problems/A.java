import java.util.*;

class A {

    static int getMax(int N,List<Integer> A) {

        if(N==1){
            return 1;
        }
        if (N==0){
            return 0;
        }
         
        if(N%2==1){
            return 1;
        }

        Collections.sort(A);
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            while (i + 1 < A.size() && A.get(i) == A.get(i + 1)) {
                i++;
            }
            if (set.contains(A.get(i) - 1)) {
                l.add(A.get(i));
                l.add(A.get(i) - 1);
            }

            if (set.contains(A.get(i)+ 1)) {
                l.add(A.get(i));
                l.add(A.get(i) + 1);
            }
            set.add(A.get(i));
        }

        return l.size() / 2;
    }

    static int maxcont(Integer[] a,int n){
        List<Integer> list  = new ArrayList<>();
         list = Arrays.asList(a);
        return 0;
    }

    public static void main(String[] args) {
    
        int N = 4;
        List<Integer> A = new ArrayList<>();

        Integer[] arr = { 1, 3, 2, 2 };
        A = Arrays.asList(arr);
   //     System.out.println(getMax(N,A));




        Integer b[] = { 2,1,7,3,7,7,37};

      //  System.out.println(maxcont(b,b.length));




      for (int i = 1; i < 10; i++) {
       System.out.println(i+" = "+Integer.toBinaryString(i));
          
      }







    }
}