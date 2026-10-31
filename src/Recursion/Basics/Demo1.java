package Recursion.Basics;

public class Demo1 {
   public static void f1(){
       int x=1;
       f2();
       System.out.println(x);
   }
   public static void f2(){
       int x=2;
       f3();
       System.out.println(x);
   }
   public static void f3(){
       int x=3;
       System.out.println(x);
   }
   public static void main(String args[]){
       f1();
    }
}

