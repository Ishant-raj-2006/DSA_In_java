// WAP for take positve integer input and print 
// divisible by 5 :- if number is divisible by 5
// divisible by 3 :- if number is divisible by 3
// divisible by both 5 and 3  :- if number is divisible by 5 and 3
// not divisible by both 5 and 3  :- if number is not divisible by 5 and 3

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = sb.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("It is divisible by both  = "+num);
        }
        else if(num%3==0){
            System.out.println("It is divisible by 3 = "+num);
        }
        else if(num%5==0)
            System.out.println("It is divisible by 5 = "+num);
        else{
            System.out.println("It is not divisible by 5 and 3  = "+num);
        }
    }
}
