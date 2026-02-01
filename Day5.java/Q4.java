// WAP for find Absoult value by using Math function 

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        double num; 
        System.out.print("Enter Number = ");
        num = sb.nextDouble();
        System.out.println(Math.abs(num));
    }
}
