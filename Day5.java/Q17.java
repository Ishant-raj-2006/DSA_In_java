// WAP for find Permitation and the combination by using function .

import java.util.Scanner;

public class Q17 {
    public static int fact(int x){
        int f = 1;
        for(int i=1; i<=x; i++){
            f *=i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n,r;
        System.out.print("Enter number of 'n' = ");
        n = sb.nextInt();
        System.out.print("Enter number of 'c' = ");
        r = sb.nextInt();
        int ncr=fact(n)/(fact(r)*fact(n-r));
        System.out.println(ncr);
    }
}
