
import java.util.Scanner;

// Take 'n' as input from user and print the following sequence.

public class Q3 {
public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    int num ;
    System.out.print("Enter Number = ");
    num = sb.nextInt();
    int n =num;
    for(int i=0; i<=num; i++){
        System.out.println(i+1);
        System.out.println(n-i);
    }
}
}

// 1:35:14