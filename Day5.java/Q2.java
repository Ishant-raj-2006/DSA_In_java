// WAP for find  Squre Qube root of any Real number by using math.sqrt function

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        double num,sq ;
        System.out.print("Enter Number = ");
        num = sb.nextDouble();
        sq = Math.cbrt(num);
        System.out.println("Squre Qube root of "+num+" is = "+sq);
}
}