package Recursion.Basics;

public class Factorial {
    public static int factor(int n){
        if(n==0){
//            System.out.println(1);
            return 1 ;
        }
        int result=factor(n-1);
//        System.out.println(n*result);
        return n*result;
    }

    static void main(String[] args) {
        System.out.println(factor(5));
    }
}
