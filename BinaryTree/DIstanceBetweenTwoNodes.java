public class DIstanceBetweenTwoNodes {
    static Node LCA(Node n, int a, int b) {
        if (n == null || n.data == a || n.data == b)
            return n;

        Node l = LCA(n.left, a, b);
        Node r = LCA(n.right, a, b);

        if (l == null)
            return r;
        if (r == null)
            return l;

        return n;
    }

    static int dis(Node n, int t) {
        if (n == null)
            return 0;
        if (n.data == t)
            return 1;

        int l = dis(n.left, t);
        if (l > 0)
            l++;

        int r = dis(n.right, t);
        if (r > 0)
            r++;

        return Math.max(l, r);

    }
    static int findDistance(Node root, int x) {
        if (root == null)
            return -1;

        int dist = -1;

        if ((root.data == x) ||
                (dist = findDistance(root.left, x)) >= 0 ||
                (dist = findDistance(root.right, x)) >= 0)
            return dist + 1;

        return dist;
    }

    static int DistanceBetween2Nodes(Node root, int a, int b) {
        Node lca = LCA(root, a, b);

        int l = findDistance(lca, a);
        int r = findDistance(lca, b);

        return l + r;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(60);

        root.right.left = new Node(90);
        root.right.right = new Node(100);

        System.out.println(DistanceBetween2Nodes(root, 40, 100));

    }
}
