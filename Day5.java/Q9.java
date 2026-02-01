// WAP for find Maximum  number of Three numbres when numberes are input taken from user , by using Math function

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 1st number = ");
        a = sb.nextInt();
        System.out.print("Enter 2nd  number = ");
        b = sb.nextInt();
        System.out.print("Enter 3rd  number = ");
        c = sb.nextInt();
        System.out.println("The Maximum number is = "+ Math.max(Math.max(a, b),c));
    }
}
