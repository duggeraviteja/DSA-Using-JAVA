import java.util.*;

public class binaryTreeToBST {
    
    static Node insertNode(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insertNode(root.left, value);
        } else if ((value > root.data)) {
            root.right = insertNode(root.right, value);
        }

        return root;
    }
    static TreeSet<Integer> set = new TreeSet<>();
    
    static void inorderData(Node root) {
        if(root == null ) return;
        
        inorder(root.left);
        set.add(root.data);
        inorder(root.right);
        
    }
    
    static void inorder(Node root) {
        if(root == null ) return;
        
        inorder(root.left);
        set.add(root.data);
        inorder(root.right);
        
    }
    
    
    
   static Node binaryTreeToBST(Node root)
    {
       
        inorderData(root);
        Node ans = null;
     //   System.out.println(set);
        
        for(int i: set){
            ans = insertNode(ans,i);
        }
       inorder(ans);

        return ans;
       
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
 
         root.left.left = new Node(40);
         root.left.right = new Node(60);
 
         root.right.left = new Node(90);
         root.right.right = new Node(100);
    
        Node a =  binaryTreeToBST(root);
        
        inorder(a);
    }
}
