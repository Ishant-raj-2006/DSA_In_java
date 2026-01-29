// WAP for Take real integer number input and check if it is an interger or not 

import java.util.Scanner;

public class Q4 {
   public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    System.out.print("Enter Number = ");
    double num = sb.nextDouble();
    int x = (int)num;
    if(num-x>0){
        System.out.println("Not an Integer");
    }
    else{
        System.out.println("Yes it an Integer");
    }
   } 
}
