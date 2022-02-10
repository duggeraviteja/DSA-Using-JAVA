import java.util.*;
import java.io.*;

public class DoubleLinkedlist {

    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            
        }
    }

    public void insertStart(int data) {
        Node nn = new Node(data);
        nn.next = head;
        nn.prev = null;
        if(head != null) {
            head.prev = nn;
        }
        head = nn;

    }


    public void insertEnd(int data) {
        Node nn = new Node(data);

        Node temp = head;

        nn.next = null;

        if(head == null) {
            nn.prev = null;
            head = nn;
        }

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = nn;
        nn.prev = temp;
    }
        void deleteNode(Node del){
            if(head==null) System.out.println("no list is found ");
        
            if(head == del) { head =del.next; }
            if(del.next !=null) {del.next.prev=del.prev; }
              if(del.prev != null) {del.prev.next = del.next;}
        }

        void deletedata(int data){
            if(head == null)   { System.out.print("no List ios present :  "); }

            Node temp =head;
           
            if(temp.data == data){
                head= temp.next;
            }
            else {

            while(temp != null) {
                if(temp.data == data){
                    temp.prev.next =temp.next;
                    break;
                }
                temp =temp.next;
            }
        }

            
        }

        void reverse()
    {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        // added all the elements sequemce wise in the
        // stack
        temp = head;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }
        // popped all the elements and the added in the
        // linked list,
        // which are in the reversed order.
    }

    int nthkey(int key){
        int c=0,d=0;
        Node temp =head;
        while(temp!=null){
            if(c==key){
             d = temp.data;
            }
            c++;
            temp=temp.next;
        }
        return d;
    }
    int nthkeyend(int n){
        int len=0;
         Node temp = head;
         while(temp != null){
             temp =temp.next;
             len++;
         }
         temp = head;
         for(int i=0;i<len-n;i++){
            temp=temp.next;
         }
         return temp.data;
    }

    void middle(){
        Node fast=head,slow=head;
        if(head ==null){
            System.out.print("no element :");
        }
        while(fast != null && fast.next != null ){  
            fast =fast.next.next;
            slow = slow.next;

        }

        System.out.print(" middel ele : "+slow.data);


       
    }




    void print() {
        Node temp = head,last=null;

        while(temp != null) {
            System.out.println(temp.data);
            last = temp;

            temp = temp.next;
        }

        // System.out.println("display in reverse order : ");
        // while(last != null) {
        //     System.out.println(last.data);
        //     last = last.prev;
        // }


    }

    public static void main(String[] args) {
        DoubleLinkedlist dll = new DoubleLinkedlist();
        dll.insertStart(10);
        dll.insertStart(20);
        dll.insertStart(30);
        dll.insertEnd(40);
        dll.insertEnd(50);


        dll.print();
        System.out.println("\n ----> ");
        //  dll.deleteNode(dll.head.next);
        // dll.deleteNode(dll.head.next.next.next.prev);
        // dll.deletedata(30);
        //  dll.reverse();
        //  System.out.println("N th key is " +dll.nthkey(2));
         System.out.println("N th key from end is:  " +dll.nthkeyend(4));

         dll.middle();

        // dll.print();
    }

} 