// WAP for find the max value  of any three numbers 


import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        double num = sb.nextDouble();
        System.out.print("Enter Number = ");
        double num1 = sb.nextDouble();
        System.out.print("Enter Number = ");
        double num2 = sb.nextDouble();
        System.out.println(Math.max(Math.max(num,num1),num2));
    }
}