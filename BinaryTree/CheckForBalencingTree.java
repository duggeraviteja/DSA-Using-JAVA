public class CheckForBalencingTree {
    static boolean res = true;

    boolean isBalanced(Node root) {

        solve(root);

        return res;

    }
    static int solve(Node n) {
        if (n == null)
            return 0;

        int l = solve(n.left);
        int r = solve(n.right);

        if (Math.abs(l - r) > 1)
            res = false;

        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        root.right = new Node(30);
        root.right.left = new Node(90);
        root.right.right = new Node(100);

        System.out.println(res);

        System.out.println(solve(root));
    }
}
