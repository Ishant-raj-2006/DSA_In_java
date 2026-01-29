//WAP for take integer input and print the absolute value of that integer 

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
         System.out.print("Enter Number = ");
        int num = sb.nextInt();
        if(num >0){
            System.out.println(num);
        }
        else{
            System.out.println(-1*num);
        }
    }
}
