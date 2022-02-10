import java.util.*; 
class InsertionOfBinaryTree {
    

  public class Node {
        int data;  
        Node left,right;
        Node(int d){
             data=d;
            left=right=null;
        }
    }

   static Node root=null;

//    public InsertionOfBinaryTree(){
//         root = null;
//     }


   public void insert(int data){
        root = insertRec(root,data);

    }


   public  Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data < root.data) {
            root.left = insertRec(root.left, data);
        }
        else if(data > root.data) {
            root.right = insertRec(root.right, data);
        } 
        return root;
    }

  static  int left=0,right=0;

  public static int getNumberofNodesRec(Node root) {
      if(root == null ){
          return 0;
      }
      if(root.left != null ){
          left++;
          getNumberofNodesRec(root.left);
      }

      if(root.left != null ){
        right++;
        getNumberofNodesRec(root.right);
    }

    System.out.println(left +" ---"+right);

      return 1 +left+right;
  }


    public void getNumberofNodes(){

    int n = getNumberofNodesRec(root); 

    System.out.println(n);
    }

   public void inorder() {
        inorderRec(root);
    }

  public  void inorderRec(Node root){
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        InsertionOfBinaryTree bst = new InsertionOfBinaryTree();
        bst.insert(50);
        bst.insert(20);
        bst.insert(20);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
       // inorder printing 
        bst.inorder();
     bst.getNumberofNodes();

        
    }
}
  