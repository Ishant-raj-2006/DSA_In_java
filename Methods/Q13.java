// WAP for find the power of any two numbers 


import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        double num = sb.nextDouble();
        System.out.print("Enter Number = ");
        double num1 = sb.nextDouble();
        System.out.print(Math.pow(num,num1));
    }
}