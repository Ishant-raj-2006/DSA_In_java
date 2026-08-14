// WAP for swap two number 



import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int a = sb.nextInt();
        System.out.print("Enter Number = ");
        int b = sb.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("------------------------------------------------------------");
        System.out.print(a+" ");
        System.out.print(b+" ");
    }
}