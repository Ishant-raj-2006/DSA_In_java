// WAP to check if a given number is prime or not.

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
       Scanner sb = new Scanner(System.in);
       int num ;
       System.out.print("Enter Number = ");
       num = sb.nextInt();
       int count = 0;
       for(int i = 1; i<=num; i++){
        if(num%i==0){
            count++;
        }
       } 
       if(count ==2 ){
        System.out.println("It is a prime Number = "+num);
       }
       else{
        System.out.println("It is not a prime number = "+num);
       }
    }
}