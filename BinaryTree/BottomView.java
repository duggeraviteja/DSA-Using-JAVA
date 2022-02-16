import java.util.ArrayList;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Pair {
    Node node;
    int hd;

    Pair(Node n, int h) {
        node = n;
        hd = h;
    }
}

public class BottomView extends BST {
    static ArrayList<Integer> bottomView(Node root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        Map<Integer, Integer> m = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();

        q.add(new Pair(root, 0));

        while (q.isEmpty() == false) {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;

            // if(!m.containsKey(level)) is repalace in top view
            m.put(hd, curr.data);

            if (curr.left != null) {
                q.add(new Pair(curr.left, hd - 1));
            }
            if (curr.right != null) {
                q.add(new Pair(curr.right, hd + 1));
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

        root.left.right = new Node(60);
        root.left.left = new Node(40);

        root.right.left = new Node(90);
        root.right.right = new Node(100);

        System.out.println(bottomView(root));

    }
}
