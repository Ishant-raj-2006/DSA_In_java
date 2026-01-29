// WAP for print 'n' to 1

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = sb.nextInt();
        for(int i=num; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
