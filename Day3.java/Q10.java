// WAP for Display this GP - 1,2,4,8,....upto 'n' terms

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int a=1,r=2,n;
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter number = ");
        n = sb.nextInt();
        for (int i= 1; i<=n; i++){
            System.out.print(a+" ");
            a*=r;
        }
    }
}
