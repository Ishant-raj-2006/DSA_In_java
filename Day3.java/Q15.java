// WAP for check composit number or not 

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num;
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        for (int i = 2; i<=num-1;){
            if(num%i==0){
                System.out.println("Yes it's Comosite Number = "+num);
                break;
            }
            else{
                System.out.println("Prime number = "+num);
                break;
            }
        }
    }
}