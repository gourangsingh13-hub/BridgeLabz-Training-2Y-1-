package Arrays.LogicBuilding;

import java.util.Scanner;

public class ArraysReversal {
    public static void reverse(int[]arr){
        int a=0;
        int b= arr.length-1;
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=arr[temp];
            a++;
            b--;


        }

    }
    public static void display(int[] arr){
        for(int a=0; a< arr.length;a++){
            System.out.println(arr[a]+" ");

        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the arr");

    }

}
