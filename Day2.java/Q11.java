// WAP take length and breadth of rectangle as input and write a program to find whether the area of rectangle as input and write a program to find whether the area of rectange is greater than its perimeter.

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter  length =");
        double num1 = sb.nextDouble();
        System.out.print("Enter breath =");
        double num2 = sb.nextDouble();
        double rec = num1*num2;
        System.out.println("The rectangle is = "+rec);
    }
}


