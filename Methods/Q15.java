// WAP for print the sum of any two numbers by using Method.

import java.util.Scanner;

public class Q15{
    public static void sum(int x,int y){
        int sum=x+y;
    System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int num1=sb.nextInt();
        System.out.print("Enter 1st number = ");
        int num2=sb.nextInt();
        sum(num1,num2);
    }
}