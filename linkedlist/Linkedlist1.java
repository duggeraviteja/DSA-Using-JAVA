
import java.util.*;



import java.io.*;

public class Linkedlist1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // inserting at beggining
    void insert(int data) {
        Node nn = new Node(data);
        nn.next = head;
        head = nn;

    }

    // Inserting at ending

    void insertEnd(int data) {
        Node nn = new Node(data);
        nn.next = null;

        if (head == null) {
            head = new Node(data);
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nn;

    }

    // Inserting at given location

    void insertAt(int data, int key) {
        Node nn = new Node(data);
        nn.next = null;
        Node temp = head;
        boolean status = false;
        while (temp != null) {
            if (temp.data == key) {
                status = true;
                break;
            }
            temp = temp.next;
        }
        if (status) {
            nn.next = temp.next;
            temp.next = nn;
        }
    }

    void deleteStart() {
        Node temp = head;
        if (temp != null) {
            head = temp.next;
        }
        System.out.println("First deleted item-->" + temp.data);
    }

    int deleteEnd() {
        Node temp = head, prev = null;

        if (temp.next == null) {
            head = null;
            return temp.data;
        } else {
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            return temp.data;
        }
    }

    // deleting a given key

    int deleteKey(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return temp.data;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return temp.data;
        }
        prev.next = temp.next;
        return temp.data;
    }

    int length() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    int countNumber(int key){
        Node temp =head;
        int count=0;
        while(temp != null){
            if(temp.data == key){
                count++;
            }
            temp =temp.next;
        }
        return count;
    }

    int getNth(int index){

        Node temp =head;
        int count=0;
        while(temp!=null){
            if(count ==index) {
                return temp.data;
            }
            count++;
            temp=temp.next;
        }
        return 0;
    }


int deleteNode(Node da){
    Node temp = head;
    temp.data = temp.next.data;
    temp.next = temp.next.next;

  return  temp.data ;
}



    boolean palindrome(){
        Node temp=head;
        boolean status=true;
        Stack<Integer> s = new Stack<Integer>();

    while(temp != null){
         s.push(temp.data);
        temp =temp.next;
    }

     while(head != null){
         int i =s.pop();

         if(i == head.data){
             status = true;
         } else {
             status = false;
             break;
         }

         head =head.next;
     }
     return status;
        
    }




    void removeDuplicates()
    {
        /*Another reference to head*/
        Node curr = head,temp;
 
        /* Traverse list till the last node */
        while (curr != null) {
              temp = curr;
           
            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }
        
            curr.next = temp;
            curr = curr.next;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println("list item-->" + temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist1 l1 = new Linkedlist1();

        

        l1.insert(10);
        l1.insert(20);
        l1.insert(20);
       l1.insert(30);
        l1.insert(30); 



        // l1.insert(40);
        // l1.insertEnd(50);
        // l1.insertEnd(60);
        // l1.insert(1);
        // l1.insertAt(111, 10);
        // l1.insertAt(131, 30);
        // l1.insertEnd(70);
        // l1.insertEnd(80);
      l1.display();

        //  l1.deleteStart();
        //  System.out.println("deleting a node with reference "+l1.deleteNode(l1.head));


        // System.out.println("nth element -->" + l1.getNth(4));

        // System.out.println("Last delted item is-->" + l1.deleteEnd());
        // System.out.println("Delted Key item is-->" + l1.deleteKey(60));

        // l1.display();

        // System.out.println("length of the list -->" + l1.length());
        // System.out.println("count number : ->" + l1.countNumber(20));


        // System.out.println("count number : ->" + l1.palindrome());
        System.out.println(" ---");
        l1.removeDuplicates();
        l1.display();


    }
}
