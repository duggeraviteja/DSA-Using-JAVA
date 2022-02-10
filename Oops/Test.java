 
 interface ABC {
   static  void show() {
System.out.println("show method from inter face");
     }
 }
 
 abstract class A  implements ABC{
   
     A() {
        System.out.println("A Classs");
    }

}

 class B extends A {

     B() {
        System.out.println("B CLass");
    }
    public void m2(){
        System.out.println("Method");
    }




}
 class C extends B {
    C() {
       System.out.println("C CLass");
   }
}
 class Test {
public static void main(String[] args) {
    C o = new C();
    o.m2();
   // o.show();
 



    final int q=0 ;


}
}

