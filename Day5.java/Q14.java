//  WAP for find sum of two numbers by calling function  .

import java.util.Scanner;

public class Q14 {
    public static void sum(int c , int d){
        System.out.println(c+d);
    }
    public static void main(String[] args) {
        int a ,b;
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        a = sb.nextInt();
        System.out.print("Enter 2nd number = ");
        b = sb.nextInt();
        sum(a,b);
    }
}
