import java.util.ArrayList;

import java.util.*;

class Pair {
    Node node;
    int level;

    Pair(Node n, int l) {
        node = n;
        level = l;
    }
}

public class TopView {

    static ArrayList<Integer> topView(Node root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        Map<Integer, Integer> m = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int level = p.level;

            if (!m.containsKey(level)) {
                m.put(level, curr.data);
            }

            if (curr.left != null) {
                q.add(new Pair(curr.left, level - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, level + 1));
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i : m.values()) {
            result.add(i);
        }
        return result;

    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(60);

        root.right.left = new Node(90);
        root.right.right = new Node(100);

        System.out.println(topView(root));

    }

}
