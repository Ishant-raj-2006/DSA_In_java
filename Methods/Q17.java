// WAP for find bigest number out 3 numbers.



import java.util.Scanner;

public class Q17 {
    public static int max(int a, int b, int c){
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return  c;
    }
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int a = sb.nextInt();
        System.out.print("Enter 2nd number = ");
        int b = sb.nextInt();
        System.out.print("Enter 3rd number = ");
        int c = sb.nextInt();
       System.out.println(max(a, b, c)); 
    }
}
