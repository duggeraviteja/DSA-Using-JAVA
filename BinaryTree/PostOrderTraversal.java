import java.util.Stack;

public class PostOrderTraversal extends BST {
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
        bstTree a = new bstTree();
        Node root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);

        postOrderRecursive(root);
        System.out.println("\n =====");

        postOrderIterative(root);

    }
}
