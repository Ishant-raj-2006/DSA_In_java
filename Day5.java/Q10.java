// WAP for find Minimum  number of Two numbres when numberes are input taken from user , by using Math function

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 1st number = ");
        a = sb.nextInt();
        System.out.print("Enter 2nd  number = ");
        b = sb.nextInt();
        System.out.print("Enter 3rd  number = ");
        c = sb.nextInt();
        System.out.println("The Minimum number is = "+ Math.min(Math.min(a, b),c));
    }
}
