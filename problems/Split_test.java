// import java.util.*;
// import java.util.Scanner;
// import java.io.*;

// class Split_test {

//   public static void main(String[] args) {
//     // Scanner sc=new Scanner(System.in);
//     // System.out.print("enter ssting : ");

//     // String a=sc.next();
//     // String b="ravi-teja-lets-go";
//     // String[] c=b.split("-").reverse();
//     // // String[] d=c.reverse();
//     // System.out.print(a.split("-")+ " "+Arrays.toString(c));

//     // }

//     LinkedList<String> cars = new LinkedList<String>();
//     cars.append("10");
//     cars.append("20");
//     // System.out.print("get method "+cars.get(5)+" \n ");
//     // System.out.print("set method "+cars.set(4,"ravi") +" \n size "+cars.size());

//     for (String i : cars) {
//       System.out.print(i + "\n");
//     }
//   }
// }


import java.util.LinkedList;

class Split_test { 
  public static void main(String[] args) { 

    String n = null;
    //n = System.console().readLine(); 


    
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add(1,"Mazda");
    System.out.println(cars);
    System.out.println("peak element : "+cars.peek());
    cars.forEach(i-> System.out.println(i));

    int c1=0,c2=0;
    int v=22, av=7,res;

String str="One";
String ast = "two";
res =v*av/av;
if(res<22){
  System.out.println(str);
}
else {
  System.out.println(ast);
}





    for (int i=0;i<5 ;i++ ){
   
      if(i>2){
        c1++;
          continue;
          
      }
      if(i>4){
        c2++;
          break;
          
      }
       System.out.println(i); 
      
  } 
  System.out.println(c1); 
  System.out.println(c2); 




  





  } 
}
