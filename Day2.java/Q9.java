// WAP for Take 3 positive integers input and tell if they can be the sides of a triangle or not.

import java.util.Scanner;

public class Q9 {
   public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    System.out.print("Enter 1st side of Trangle = ");
    double num1 = sb.nextDouble();
    System.out.print("Enter 2nd side of Trangle = ");
    double num2 = sb.nextDouble();
    System.out.print("Enter 3rd side of Trangle = ");
    double num3 = sb.nextDouble();
    if (num1<num2+num3 && num2<num1+num3 && num3<num1+num2 ){
        System.out.println("Yes it is Trangle");
    }
    else{
        System.out.println("No it is not trangle");
    }
} 
}
