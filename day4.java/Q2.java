// WAP for print squre * , when input take from user 

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num ;
        System.out.print("Enter number = ");
        num = sb.nextInt();
        for(int i =1; i<=num; i++){
            for (int j=1; j<=num; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
