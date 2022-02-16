public class SumTree {

    static int leftSum = 0;
    static int rightSum = 0;

    static int sumTree(Node root) {
        if (root == null)
            return 0;

        leftSum = sumTree(root.left);
        rightSum = sumTree(root.right);

        int x = root.data;
        int tsum = leftSum + rightSum;
        root.data = tsum;
        return tsum + x;

       // return sumTree(root.left) + sumTree(root.right) + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
 
         root.left.left = new Node(40);
         root.left.right = new Node(60);
 
         root.right.left = new Node(90);
         root.right.right = new Node(100);
 

        System.out.println(sumTree(root));

    }
}
