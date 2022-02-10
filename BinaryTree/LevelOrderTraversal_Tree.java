import java.util.*;

public class LevelOrderTraversal_Tree extends BST {

 static   void LevelOrderPrinting(Node node) {
        // code here
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
        

        System.out.println("level order : ");

        LevelOrderPrinting(root);

        System.out.println("Reverse level order : ");
        reverseLevelOderingTraversing(root);

    }
}
