//WAP for find Maximum number of three numbers 

import java.util.Scanner;

public class Q15 {
public static void max(int a, int b ,int c){
if(a>=b && a>=c){
    System.out.println(a);
}
else if (b>=a && b>= c){
    System.out.println(b);
}
else{
    System.out.println(c);
}
}
    public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    int b,c,d;
    System.out.print("Enter 1st number = ");
    b = sb.nextInt();
    System.out.print("Enter 2nd number = ");
    c = sb.nextInt();
    System.out.print("Enter 3rd number = ");
    d = sb.nextInt();
    max(b,c,d);
   } 
}