
// WAP for Display GP- 1,2,4,8....

import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n;
        System.out.print("Enter Number = ");
        n = sb.nextInt();
        int a=1, r=2;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a *=r;
        }
    }
}