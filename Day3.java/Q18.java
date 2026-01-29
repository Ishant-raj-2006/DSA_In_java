// WAP Reverse of a Number 

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num,rev=0;
        System.out.print("Enter number = ");
        num = sb.nextInt();
        while (num!=0) {
            rev *= 10;
            rev += (num%10);
            num/=10;
        }
        System.out.println(rev);
    }
}