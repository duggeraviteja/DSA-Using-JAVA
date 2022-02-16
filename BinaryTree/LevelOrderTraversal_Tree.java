import java.util.*;


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class LevelOrderTraversal_Tree {

 static   void LevelOrderPrinting(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (q.size() > 0) {

            for (int i = 0; i < q.size(); i++) {
                node = q.remove();
                list.add(node.data);

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }
        System.out.println(list);
    }


  static  void reverseLevelOderingTraversing(Node node) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (q.size() > 0) {

            for (int i = 0; i < q.size(); i++) {
                node = q.remove();
                list.add(node.data);
                
                 if (node.right != null) {
                    q.add(node.right);
                }

                if (node.left != null) {
                    q.add(node.left);
                }
               
            }
        }

        Collections.reverse(list);
        
        System.out.println( list );


    }

    public static void main(String[] args) {
      
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
 
         root.left.left = new Node(40);
         root.left.right = new Node(60);
 
         root.right.left = new Node(90);
         root.right.right = new Node(100);
 
        

        System.out.println("level order : ");

        LevelOrderPrinting(root);

        System.out.println("Reverse level order : ");
        reverseLevelOderingTraversing(root);

    }
}
