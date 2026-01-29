// WAP for find Factorial of a given number 

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num ,fact=1;
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        int temp = num;
    if(num==0){
        System.out.print("The factorial of "+"num"+" is = "+"1");
    }
    else{
        for(int i=1; i<=num; i++){
            fact *=i;
        }

    }
    System.out.println("The Factorial of "+ temp+" is "+fact);
    }
}