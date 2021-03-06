
public class HeightOfTree {

    static int height(Node node) {

        if (node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        return 1 + Math.max(left, right);
    }

    static int distanceFromRoot_Node(Node n, int t) {
        if (n == null)
            return 0;
        if (n.data == t)
            return 1;

        int l = distanceFromRoot_Node(n.left, t);
        if (l > 0)
            l++;

        int r = distanceFromRoot_Node(n.right, t);
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

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(60);

        root.right.left = new Node(90);
        root.right.right = new Node(100);

        System.out.println(" height : " +height(root));

        System.out.println(distanceFromRoot_Node(root, 100));

        System.out.println(findDistance(root, 40));

    }
}
