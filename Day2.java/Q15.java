// WAP for find even or odd with ternary Operator
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = sb.nextInt();
        System.out.println((num%2==0) ? "Even " : "Odd");
    }
}
