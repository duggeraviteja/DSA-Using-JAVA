import java.util.ArrayList;
import java.util.Set;

public class PalindromePartining {
    static boolean isPalindrome(String s, int start, int end) {

        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

    static void func(int ind, String s, ArrayList<String> list, ArrayList<ArrayList<String>> res) {
        // Base Case
        if (ind == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }

        // Recursive
        for (int i = ind; i < s.length(); i++) {
            if (isPalindrome(s, ind, i)) {
                list.add(s.substring(ind, i + 1));
                func(i + 1, s, list, res);
                list.remove(list.size() - 1);
            }
        }
    }


    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {

        ArrayList<ArrayList<String>> res = new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();
  
        func(0, S, list, res);




        return res;
    }

 
 

    public static void main(String[] args) {
        String s = "madam";

        System.out.println(allPalindromicPerms(s));


    }
}
