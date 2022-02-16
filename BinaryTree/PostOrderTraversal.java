import java.util.Stack;

public class PostOrderTraversal {
    static void postOrderRecursive(Node root) {
        if (root == null) {
            return;
        }

        postOrderRecursive(root.left);
        postOrderRecursive(root.right);

        System.out.print(root.data + " ");
    }

    static void postOrderIterative(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        Stack<Integer> out = new Stack<>();

        while (!stack.empty()) {
            Node curr = stack.pop();
            out.push(curr.data);

            if (curr.left != null) {
                stack.push(curr.left);
            }

            if (curr.right != null) {
                stack.push(curr.right);
            }
        }

        while (!out.isEmpty()) {
            System.out.print(out.pop() + " ");
        }

    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(60);

        root.right.left = new Node(90);
        root.right.right = new Node(100);

        postOrderRecursive(root);
        System.out.println("\n =====");

        postOrderIterative(root);

    }
}
