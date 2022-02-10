import java.util.Stack;


public class PreOrderTraversal  extends BST{

    static void preOrderRecursive(Node root) {

        if(root == null ){
            return;
        }
        System.out.print(root.data+" ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }
     static void iterativePreOrder(Node root) {
         Stack<Node> st = new Stack<>();

         if(root == null) {
             return;
         }

         st.push(root);

         while( !st.isEmpty()) {
            Node temp = st.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                st.push(temp.right);
            }
            if (temp.left != null) {
                st.push(temp.left);
            }
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

        preOrderRecursive(root);
        System.out.println("\n ====");

        iterativePreOrder(root);
    }
    
}
