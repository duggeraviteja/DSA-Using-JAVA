import java.util.*;

public class SortBasedOnfrequnceyvalues {


    static List<Integer> Solution(List<Integer> list){
        HashMap<Integer,Integer> map = new HashMap<>();
         
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i),0)+1);
            }

        // Collections.sort(list,(a,b) ->{
        //     int f1 = map.get(a);
        //     int f2 = map.get(b);
        //     if(f1 != f2){
        //         return f1-f2;
        //     }
        //     return a - b;
        // });

        

        //System.out.println(map);

        Collections.sort(list,
        (n1,n2)->
        {
            if(map.get(n1) > map.get(n2)) 
            return -1;
            return 1;
            });

      return list;
    }




    static void solve(String[] S, int N) {
        // write your code here
        HashMap <String, Integer> hm = new HashMap<>();
        for(String elem : S){
            if(!hm.containsKey(elem)){
                hm.put(elem, 0);
            }
            hm.put(elem, hm.get(elem) + 1);
        }
        String arr[] = new String[hm.size()];
        int index = 0;
        for(String elem : hm.keySet()){
            arr[index++] = elem;
        }


        System.out.println(Arrays.toString(arr));

    }





    public static void main(String[] args) {
        Integer arr[] = { 10, 20, 30, 40 ,45,6,6,78,8,999};

        List<Integer> li = Arrays.asList(arr);

      System.out.println(Solution(li));

       String s[] = {"https://www.hackerearth.com", "https://www.wikipedia.org",
        "https://www.google.com", "https://www.hackerearth.com",
        "https://www.hackerearth.com", };

       
       solve(s,s.length);


    
        
 

    }
}
 