public class MirrorOfTree extends InsertionOfBinaryTree {

    static void mirror(Node node) {
        if(node==null)return;
       else
       {
           Node temp = node.left;
           node.left=node.right;
           node.right=temp;
           
           mirror(node.left);
           mirror(node.right);
           
       }
    }
    public static void main(String[] args) {
         
        InsertionOfBinaryTree bst = new InsertionOfBinaryTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        bst.insert(40);
        bst.insert(60);

       
        bst.inorder();
       mirror(root);

       System.out.println("======");

        bst.inorder();

    }
    
}
