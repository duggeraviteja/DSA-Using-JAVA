import java.util.*;

public class RearrangeCharacters {
    public static String rearrangeCharacters(String str) {
        StringBuilder res = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++)
    map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> {

            return map.get(b) - map.get(a);
        });
        queue.addAll(map.keySet());

        while (queue.size() > 1) {

            Character curr = queue.remove();

            Character next = queue.remove();

            res.append(curr);
            res.append(next);
            
            map.put(curr, map.getOrDefault(curr, 0) - 1);
            map.put(next, map.getOrDefault(next, 0) - 1);
            if (map.get(curr) > 0)
                queue.add(curr);
            if (map.get(next) > 0)
                queue.add(next);
        }

        if (queue.size() == 1) {
            Character temp = queue.remove();
            if (map.get(temp) > 1)
                return "-1";
            if (map.get(temp) == 1)
                res.append(temp);
        }

        return res.toString();
    }

    static int Solution(String s, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        float val = n / 2;
        int size = (int) Math.ceil(val);

        for (char i : map.keySet()) {

            if (map.get(i) > size) {
                return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {

        String s = "geeksforgeeks";
        // System.out.println(Solution(s,s.length()));

        System.out.println(rearrangeCharacters(s));
    }
}
