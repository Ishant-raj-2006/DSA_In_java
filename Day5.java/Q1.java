// WAP for find  Squre root of any Real number by using math.sqrt function

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        double num,sq ;
        System.out.print("Enter Number = ");
        num = sb.nextDouble();
        sq = Math.sqrt(num);
        System.out.println("Squre root of "+num+" is = "+sq);
}
}