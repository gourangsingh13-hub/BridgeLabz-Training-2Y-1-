package Arrays.LogicBuilding;

import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
       int n=sc.nextInt();
        int sum=0;
        sum+=n*(n+1)/2;
        System.out.println(sum);
    }

}