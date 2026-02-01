// WAP for find Power of any real number by using Math function

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        double base,p;
        System.out.print("Enter thw value of base = ");
        base = sb.nextDouble();
        System.out.print("Enter the value of Power = ");
        p = sb.nextDouble();
        System.out.println(Math.pow(base,p));
    }
}
