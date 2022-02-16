public class Delete_Node {
//       100                            100  
//     /    \                          /    \
//    65     120   = > (120) =>       65     133
//    / \    / \                      / \    / 
//   52  70 107 133                 52  70  107


     static int max(Node root) {
        if(root.right != null ) {
            return max(root.right);
        } else {
            return root.data;
        } 
        
    }
    public static Node deleteNode(Node root, int X) {
        if(root == null ) return null;
        
        if(X > root.data) {
            root.right = deleteNode(root.right , X);
        } else if (X  < root.data) {
            root.left = deleteNode(root.left , X) ; 
        }  else {
            if(root.left != null && root.right != null) {
                int lmax = max(root.left);
                root.data = lmax;
                root.left = deleteNode(root.left , lmax);
            } else if(root.left != null ){
                return root.left;
            } else if(root.right != null ) {
                return root.right;
            }else {
                return null;
            }
        }
        
        return root;
    }

 public  static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root= new Node(100);
        root.left = new Node(65);          
        root.right = new Node(120);

        root.left.right = new Node(70);
        root.left.left = new Node(52);

        root.right.left = new Node(107);
        root.right.right = new Node(133);

         root =  deleteNode(root, 120);

        inorder(root);
    }
}
