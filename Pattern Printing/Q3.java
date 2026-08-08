// WAP for print the star trangle 

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
    int num;
    System.out.print("Enter Number =");
    num = sb.nextInt();
    for(int i=1; i<=num; i++){
        for(int j=i;j<=num; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }

    }
}
