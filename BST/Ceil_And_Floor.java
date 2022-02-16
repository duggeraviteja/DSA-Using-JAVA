
public class Ceil_And_Floor {
    static Integer floor = null;
    static Integer ceil = null;


    static void find_ceil_floo(Node root,int  key) {
        while (root != null)
        {
            if (root.data == key)
            {
                ceil = root.data;
                floor = root.data;
                return;
            }
     
            if (key > root.data)
            {
                floor = root.data;
                root = root.right;
            }
            else
            {
                ceil = root.data;
                root = root.left;
            }
        }
        return;
    }
    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(65);
        root.right = new Node(120);

        root.left.right = new Node(70);
        root.left.left = new Node(52);

        root.right.left = new Node(107);
        root.right.right = new Node(133);


        find_ceil_floo(root,67);

        System.out.println(floor +" == "+ceil);

    }
}
