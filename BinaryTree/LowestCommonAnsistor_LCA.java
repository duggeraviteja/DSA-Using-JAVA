public class LowestCommonAnsistor_LCA {
    static Node lca(Node root,int n1,int n2) {
        
        if(root== null || root.data == n1 || root.data == n2){
		    return root;
        }
        Node left = lca(root.left,n1,n2);
		Node right = lca(root.right,n1,n2);
		
		if(left == null){
		    return right;
		}
		if(right == null){
		    return left;
		}   
	
		    return root;                                        
		
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);

        int n1 = 3 , n2 = 4;

        Node ans = lca(root,n1,n2);
        System.out.println(ans.data);
    }
}
