// WAP for take positive interger input and tell if it a four digit number or not 

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
       Scanner sb = new Scanner(System.in);
       System.out.print("Enter numebr = ");
       int num = sb.nextInt();
     if(num>=1000 && num<=9999 ){
System.out.println("YES it is four digit number = "+num);
       } 
       else{
        System.out.println("No it is not four digit number = "+num);
       }
    }
}
