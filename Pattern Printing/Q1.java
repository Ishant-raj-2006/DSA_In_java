// WAP for print the Star Rectangle.


import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        int num;
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number =");
        num = sb.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}