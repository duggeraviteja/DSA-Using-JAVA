public class HeightOfTree extends InsertionOfBinaryTree {


   static int height(Node node){
    
    if (node == null){
        return 0;
    }

    int left = height(node.left);
    int right = height(node.right);    

     return 1 + Math.max(left,right);
    }
    public static void main(String[] args) {
        InsertionOfBinaryTree bst = new HeightOfTree();
        bst.insert(50);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

       // bst.inorder();
System.out.println(height(root));



    }
}
