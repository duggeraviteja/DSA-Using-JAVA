import java.util.ArrayList;


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

class Pair
{
    Node node;
    int level;
    Pair(Node n,int l)
    {
        node=n;
        level=l;
    }
}
public class TopView extends BST{


static ArrayList<Integer> topView(Node root)
{
    if(root==null)
    {
        return new ArrayList<Integer>();
    }
    Map<Integer,Integer> m=new TreeMap<>();
    Queue<Pair> q=new LinkedList<Pair>();
    
    q.add(new Pair(root,0));
    
    while(q.isEmpty()==false)
    {
        Pair p=q.poll();
        Node curr=p.node;
        int level=p.level;
        
        if(!m.containsKey(level))
        {
              m.put(level,curr.data);
        }
      
        if(curr.left!=null)
        {
            q.add(new Pair(curr.left,level-1));
        }
        if(curr.right!=null)
        {
            q.add(new Pair(curr.right,level+1));
        }
    }
    
    ArrayList<Integer> result=new ArrayList<>();
    
    for(int i : m.values())
    {
        result.add(i);
    }
    return result;
    
}



    public static void main(String[] args) {
     
    Node root = new Node(10);
       root.left = new Node(20);
       root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(60);

        root.right.left = new Node(90);
        root.right.right = new Node(100);

    

  System.out.println(topView(root));

   System.out.println(sumTree(root));

    }

    static int  leftSum = 0;
    static int rightSum = 0;

     static   int sumTree(Node root){
            if(root==null) return 0;
            
             leftSum = sumTree(root.left);
             rightSum = sumTree(root.right);
             
             int x=root.data;
             int tsum=leftSum+rightSum;
             root.data=tsum;
             return tsum+x;
        }
    
}
