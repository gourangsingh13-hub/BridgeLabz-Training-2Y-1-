package Recursion.Basics;

public class Print {
    public static void printInc(int n){
//        printInc(n-1);
//        System.out.print(n+" ");

        if(n==-10){
            System.out.println(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
     printInc(10);
    }
}