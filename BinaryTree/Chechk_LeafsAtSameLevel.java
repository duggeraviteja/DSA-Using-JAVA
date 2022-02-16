public class Chechk_LeafsAtSameLevel {
    static boolean ans = false;

    static int check(Node root)  {
        if(root == null)
        return -1;

        int left = check(root.left);
        int right = check(root.right);
        if(root.left != root.right && root.right != null){
            if(left != right){
                ans = false;
            }
        }
        return Math.max(left, right)+1;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(60);

        root.right.left = new Node(90);
        root.right.right = new Node(100);
        
        System.out.println(check(root));
        System.out.println(ans);

    }
}
