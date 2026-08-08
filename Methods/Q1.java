// WAP for find the cube root of any number by using Math function



import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = sb.nextInt();
        System.out.println(Math.cbrt(num));
    }
}
