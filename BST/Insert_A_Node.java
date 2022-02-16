public class Insert_A_Node extends Delete_Node {

    static Node insertNode(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insertNode(root.left, value);
        } else if ((value > root.data)) {
            root.right = insertNode(root.right, value);
        }

        return root;
    }

    static boolean search(Node root, int x) {
        if (root == null)
            return false;
        if (x == root.data) 
            return true;
        else if (x > root.data) {
            return search(root.right, x);
        } else {
            return search(root.left, x);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(65);
        root.right = new Node(120);

        root.left.right = new Node(70);
        root.left.left = new Node(52);

        root.right.left = new Node(107);
        root.right.right = new Node(133);

        root = insertNode(root, 27);
        root = insertNode(root, 127);

        System.out.println(search(root, 52) ? "Yes" : "No");

        inorder(root);
    }
}
