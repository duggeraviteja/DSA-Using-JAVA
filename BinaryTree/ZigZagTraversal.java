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

public class ZigZagTraversal {

    static ArrayList<Integer> zigzagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<>();

        q.add(root);
        boolean flag = true;

        while (!q.isEmpty()) {
            int len = q.size();
            while (len-- > 0) {
                Node curr = q.poll();
                ans.add(curr.data);
                if (flag) {
                    if (curr.left != null)
                        s.push(curr.left);

                    if (curr.right != null)
                        s.push(curr.right);
                } else {
                    if (curr.right != null)
                        s.push(curr.right);

                    if (curr.left != null)
                        s.push(curr.left);
                }
            }
            while (!s.isEmpty())
                q.add(s.pop());

            flag = !flag;
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        root.right = new Node(30);
        root.right.left = new Node(90);
        root.right.right = new Node(100);
        System.out.println(zigzagTraversal(root));

    }
}
