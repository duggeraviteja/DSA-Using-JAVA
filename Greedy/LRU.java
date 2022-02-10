import java.util.*;

public class LRU {
    static int pageFaults(int N, int C, int pages[]) {
        ArrayList<Integer> s = new ArrayList<>(C);
        int count = 0;
        int page_faults = 0;
        for (int i : pages) {
            if (!s.contains(i)) {
                if (s.size() == C) {
                    s.remove(0);
                    s.add(C - 1, i);
                } else { 
                    s.add(count, i);
                }
                page_faults++;
                ++count;

            } else {
                s.remove((Object) i);
                s.add(s.size(), i);
            }

        }

        return page_faults;
    }

    static int lru(int n,int c,int[] pages){

        int cnt=0;
       Queue<Integer> l=new LinkedList<>();
       for(int i=0;i<n;i++)
       {
           if(l.size()<c || l.contains(pages[i]))
           { 
               if(!l.contains(pages[i])) {
                cnt++;
               }
               else {
                l.remove(pages[i]);
               }
               
               l.add(pages[i]);
           }
           else
           {
               cnt++;
               l.poll();
               l.add(pages[i]);
           }
       }
       return cnt;
    }
    public static void main(String[] args) {

        int N = 9, C = 4;
        int[] pages = { 5, 0, 1, 3, 2, 4, 1, 0, 5 };

        System.out.println(pageFaults(N, C, pages));

        System.out.println(lru(N, C, pages));

    }

}
