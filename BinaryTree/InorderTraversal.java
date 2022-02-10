import java.util.Stack;


public class InorderTraversal extends BST  {

    static void recursiveInorder(Node root) {
        if(root == null ) {
            return;
        }

        recursiveInorder(root.left);
        System.out.print(root.data +" ");
        recursiveInorder(root.right);
    }

    static void iterativeInorder(Node root) {
        Stack<Node> st = new Stack<>();
        Node temp =root;

        while( !st.isEmpty() || temp != null) {
            if(temp != null) {
                st.push(temp);
                temp = temp.left;
            } else {
               temp =    st.pop();
                System.out.print(temp.data +" ");
               temp =  temp.right;
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

        //  Recursive inorder traversing  
        recursiveInorder(root);


        System.out.println("\n=========");
        // Iterative inorder 
        iterativeInorder(root);
        
    }
}
