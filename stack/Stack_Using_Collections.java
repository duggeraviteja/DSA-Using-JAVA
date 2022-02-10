import java.util.*;

class Stack_Using_Collections
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();

        stack.push("A");    // Insert `A` into the stack
        stack.push("B");    // Insert `B` into the stack
        stack.push("C");    // Insert `C` into the stack
        stack.push("D");    // Insert `D` into the stack


        Iterator iterator = stack.iterator();
      while(iterator.hasNext()) {
         System.out.println(iterator.next());

      }
      
//           System.out.println(" " +stack);
          System.out.print("=-----> "+stack.search("A"));


        // prints the top of the stack (`D`)
        System.out.println("\nThe top element is " + stack.peek());

        stack.pop();        // removing the top element (`D`)
        stack.pop();        // removing the next top (`C)

        // returns the total number of elements present in the stack
        System.out.print(stack);
        System.out.println("The stack size is " + stack.size());

        // check if the stack is empty
        if (stack.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
