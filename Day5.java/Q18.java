// WAP for swap two numbers .

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sb  = new Scanner(System.in);
        int a,b;
        System.out.print("Enter 1st Number = ");
        a = sb.nextInt();
        
        System.out.print("Enter 2nd Number = ");
        b = sb.nextInt();
        int temp ;
        temp = a;
        a=b;
        b=temp;
        System.out.print(a+" This is 1st value \n"+b+" This is 2nd value");

    }
}
