import java.util.*;

public class WordBreak {

    static void solve(List<String> dict, String s, List<String> ans, String temp) {
        if (s.length() == 0) {
            ans.add(temp.substring(1));
            return;
        }
        for (int i = 1; i <= s.length(); i++)
            if (dict.contains(s.substring(0, i)))
                solve(dict, s.substring(i), ans, temp + " " + s.substring(0, i));
    }

    public static void main(String[] args) {
        String s = "catsanddog";
        String[] d = { "cats", "cat", "and", "sand", "dog" };


   

        List<String> dict = new ArrayList<>(Arrays.asList(d));
    
        List<String> ans = new ArrayList<String>();

        solve(dict, s, ans, "");
        System.out.println(ans);

    }
}
