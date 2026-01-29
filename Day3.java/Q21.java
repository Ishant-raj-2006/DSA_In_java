// WAP for 'a' raise to the power 'b'

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int  base,power,ans=1;
        System.out.print("Enter the value of Base = ");
        base = sb.nextInt();
        System.out.print("Enter the value of power = ");
        power = sb.nextInt();
        for(int i=1; i<=power; i++){
            ans *= base;
        }
        System.out.println(ans);
    }
}
