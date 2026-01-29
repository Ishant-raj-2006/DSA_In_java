// WAP for print sum of number & its revers
import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, rev = 0, rem;
        int temp = num;   // original number save

        while (temp != 0) {
            rem = temp % 10;      // last digit
            sum = sum + rem;     // sum of digits
            rev = rev * 10 + rem; // reverse
            temp = temp / 10;    // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
        System.out.println("Reverse number = " + rev);
    }
}
