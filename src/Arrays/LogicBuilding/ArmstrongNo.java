package Arrays.LogicBuilding;

import java.util.Scanner;

public class ArmstrongNo {
    public static int count(int n) {
        int count = 0;
        int temp = n;
        while (temp > 0) {
            count++;
            temp = temp / 10;

        }
        return count;
    }
 static boolean isArmstrong(int n){
        int digits= count(n);
        int temp=n;
        int sum=0;
         while(temp > 0){
             int digit =temp%10;
             sum +=(int) Math.pow(digit,digits);
             temp=temp/10;
         }
         return sum== n;

    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter an no.");
        int n=sc.nextInt();
        if(isArmstrong(n)){
            System.out.println("it is an armstrong no.");
        }
        else{
            System.out.println("it is not an armstrong no");
        }
    }
}
