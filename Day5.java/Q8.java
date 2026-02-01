// WAP for find Maximum  number of Two numbres when numberes are input taken from user , by using Math function

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int a,b;
        System.out.print("Enter 1st number = ");
        a = sb.nextInt();
        System.out.print("Enter 2nd  number = ");
        b = sb.nextInt();
        System.out.println("The Maximum number is = "+ Math.max(a, b));
    }
}
