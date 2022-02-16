import java.util.ArrayList;
import java.util.HashMap;

public class Print_All_K_SumPapths {

    static ArrayList<Integer> list = new ArrayList<>();

    int mod = 1000000007;
    static int ans = 0;
    HashMap<Integer, Integer> mp = new HashMap<>();

    public void sumK_util(Node root, int sum, int cur) {
        if (root == null)
            return;

        ans = (ans + (mp.getOrDefault(cur + root.data - sum, 0)) % mod) % mod;
        if ((cur + root.data) == sum)
            ans = (ans + 1) % mod;

        mp.put(cur + root.data, (mp.getOrDefault(cur + root.data, 0) + 1) % mod);
        sumK_util(root.left, sum, cur + root.data);
        sumK_util(root.right, sum, cur + root.data);
        mp.put(cur + root.data, ((mp.getOrDefault(cur + root.data, 0) - 1) + mod) % mod);
    }

    static void print(ArrayList<Integer> l, int i) {
        for (int j = i; j < l.size(); j++) {
            System.out.print(l.get(j) + " ");
        }
        System.out.println();
    }

    static void printKSum(Node root, int k) {
        if (root == null)
            return;

        list.add(root.data);

        printKSum(root.left, k);
        printKSum(root.right, k);

        int sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
            if (sum == k) {
                print(list, i);
            }
        }

        list.remove(list.size() - 1);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.left.right.left = new Node(1);
        root.right = new Node(-1);
        root.right.left = new Node(4);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.right = new Node(2);
        int k = 5;

        // printKSum(root, k);

        Print_All_K_SumPapths ob = new Print_All_K_SumPapths();

        ob.sumK_util(root, k, 0);
        System.out.println(ans);

    }
}
