//WAP for print sum of digit of a number 

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num, count= 0,sum=0; 
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        int copy = num,rev=0;
        while (num !=0) {
            count=num%10;
            sum +=count;
            num/=10;

        }
        System.out.println("The sum of "+copy+" is "+sum);
    }
}