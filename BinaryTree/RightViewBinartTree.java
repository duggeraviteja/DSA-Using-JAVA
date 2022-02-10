import java.util.ArrayList;

public class RightViewBinartTree extends BST {
      static ArrayList<Integer> list = new ArrayList<>();
    static void rightView(Node root,int level) {
        if(root == null) {
            return;
        }
        if(list.size() == level) 
           list.add(root.data);

        rightView(root.right ,level+1);       
        rightView(root.left,level+1);
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

    rightView(root,0);

    System.out.println(list);
    }
}
