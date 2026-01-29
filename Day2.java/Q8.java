// WAP for Take positive integer input and tell if it is divisible by 5  or 3 .

import java.util.Scanner;

public class Q8 {
   public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    System.out.print("Enter Number = ");
    int num = sb.nextInt();
    if(num%5==0 || num%3==0){
        System.out.println("Yes it is divisible by 5 or 3 ");
    }
    else{
        System.out.println("No it is not divisible by 5 or 3");
    }
   } 
}
