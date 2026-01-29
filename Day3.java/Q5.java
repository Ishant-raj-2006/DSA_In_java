// WAP for print table when input taken from user .

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = sb.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(num+"X"+i+" = "+num*i);
        }
    }
}
