public class BinaryTreeToDLL {
    Node head, tail;

    public void insertAtEnd(Node root) {
        if (root == null)
            return;
        if (head == null) {
            head = root;
            tail = root;
        } else {
            tail.right = root;
            root.left = tail;
            tail = root;
        }
    }

    public void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        insertAtEnd(root);
        inOrder(root.right);

    }

    public void print() {

       Node prev = head;

       while(head != null) {
           System.out.print(head.data +" ");
           prev = head;
           head = head.right;
       }
    //    System.out.println();
    //    while( prev != null) {
    //     System.out.print(prev.data +" ");
    //     prev = prev.left;
    //    }

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(60);

        // root.right.left = new Node(90);
        // root.right.right = new Node(100);

        BinaryTreeToDLL ob = new BinaryTreeToDLL();
        ob.inOrder(root);

        // printing double linked list

        ob.print();

    }
}
