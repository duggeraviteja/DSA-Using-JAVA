public class TwoTreeMirrorOrNot {
    static boolean areMirror(Node a, Node b) {
        if(a == null || b == null) return a == b;
        if(a.data == b.data) {
            return areMirror(a.left, b.right) && areMirror(a.right, b.left);
        }
        return false;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        a.left = new Node(20);
        a.right = new Node(30);
      // a.left.left = new Node(40);
       a.right.right = new Node(50);


        Node b = new Node(10);
        b.left = new Node(30);
        b.right = new Node(20);
        b.left.left = new Node(50);
        //a.left.right = new Node(40);






        
        System.out.println(areMirror(a,b));
    }
}
