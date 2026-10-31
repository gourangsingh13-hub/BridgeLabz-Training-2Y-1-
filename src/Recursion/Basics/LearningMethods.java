package Recursion.Basics;

public class LearningMethods {
     public static int add(int a,int b){
         return a+b;
    }

     public static void mul(int a,int b){
        int result=a*b;
         System.out.println(result);
     }


    public static void main(String args[]){
        System.out.println(add(10,20));
        mul(10,20);
    }
}
