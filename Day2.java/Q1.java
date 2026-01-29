// WAP for find even or odd 

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
         System.out.print("Enter number = ");
         int num = sb.nextInt();
         if(num%2==0){
            System.out.print("Even Number ");
         }
         else{
            System.out.print("Odd Number ");
         }
    }
}