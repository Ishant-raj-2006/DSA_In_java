// WAP for Max of any number 


import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        double num = sb.nextDouble();
        System.out.print("Enter Number = ");
        double num1 = sb.nextDouble();
        System.out.println(Math.max(num , num1));
    }
}