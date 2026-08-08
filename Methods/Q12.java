// WAP for find the min value  of any four numbers 


import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        double num = sb.nextDouble();
        System.out.print("Enter Number = ");
        double num1 = sb.nextDouble();
        System.out.print("Enter Number = ");
        double num2 = sb.nextDouble();
        System.out.print("Enter Number = ");
        double num3 = sb.nextDouble();
        System.out.println(Math.min(Math.min(Math.min(num,num1),num2),num3));
    }
}