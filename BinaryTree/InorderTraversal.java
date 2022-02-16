import java.util.Stack;


public class InorderTraversal   {

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
           
    Node root = new Node(10);
    root.left = new Node(20);
    root.right = new Node(30);

     root.left.left = new Node(40);
     root.left.right = new Node(60);

     root.right.left = new Node(90);
     root.right.right = new Node(100);

 
        //  Recursive inorder traversing  
        recursiveInorder(root);


        System.out.println("\n=========");
        // Iterative inorder 
        iterativeInorder(root);
        
    }
}
