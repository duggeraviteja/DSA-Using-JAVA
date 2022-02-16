
class Node {
  Node left;
  Node right;
  int data;
}

class bstTree {
  
  public Node insert(Node node, int val) {
    if(node == null) {
      return createNewNode(val);
    }
    
    if(val < node.data) {
      node.left = insert(node.left, val);
    } else if((val > node.data)) {
      node.right = insert(node.right, val);
    }
    
    return node;
  }
  
  public Node createNewNode(int k) {
    Node a = new Node();
    a.data = k;
    a.left = null;
    a.right = null;
    return a;
  }
}



public class BST {
   
 static int dis(Node n, int t){
    if(n==null)
        return 0;
    if(n.data==t)
        return 1;
        
    int l = dis(n.left, t);
    if(l>0)
        l++;
    
    int r = dis(n.right, t);
    if(r>0)
        r++;
    
    return Math.max(l,r);
    
}

    public static void inorderRec(Node root){
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data +" ");
            inorderRec(root.right);
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
    

    inorderRec(root);
    System.out.println();

    System.out.println(dis(root,10));


  }

}