public class DiaMeterOfTree extends BST {
    static int length = 0;

    static public int solve(Node root) {
        if (root == null)
            return 0;

        int l = solve(root.left);
        int r = solve(root.right);

        if (l + r + 1 > length) {
            length = l + r + 1;
        }

        return 1 + Math.max(l, r);
    }

    static int diameter(Node root) {

        solve(root);

        return length;
    }

    public static void main(String[] args) {

        bstTree a = new bstTree();
        Node root = null;
        root = a.insert(root, 10);
        root = a.insert(root, 20);
        root = a.insert(root, 30);

        root = a.insert(root, 40);
        root = a.insert(root, 60);

        System.out.println(diameter(root));

    }
}
