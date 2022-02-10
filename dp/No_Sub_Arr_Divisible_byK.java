import java.util.*;


public class No_Sub_Arr_Divisible_byK {

    static int Solution(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int rem = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++)     {
            sum += arr[i];
            rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            if (map.containsKey(rem)) {
                ans += map.get(rem);
                map.put(rem, map.get(rem) + 1);
            } else {
                map.put(rem, 1);
            }
        }
        System.out.println(map);

        return ans;
    }
    static int findsum(int arr[],int k)
    {
        //Your code here
        int n =arr.length;
        int sum=0;
        int count=0;
          Set <Integer> hash = new HashSet<Integer>();
     for(int i = 0 ; i < n ; i++)
     {
       sum = sum + arr[i];
       if(arr[i] == k || sum == k || hash.contains(sum))
        count++;
        else 
        hash.add(sum);
     }
     return count;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        System.out.println(Solution(arr, k));
        System.out.println(findsum(arr, k));
    }

}
