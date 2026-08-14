// Take 'n' and 'r' as input and print nCr.
// n!/r!(n-r)!



import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter the value of 'n' = ");
        double n = sb.nextInt();
        System.out.print("Enter the value of 'n' = ");
        double r = sb.nextInt();
        for(int i=1; i<=n; i++)
        {
            n *=i;
        }
        for(int i=1; i<=r; i++)
        {
            r *=i;
        }
        double ncr = (n)/(r)*(n-r);
        System.out.println(ncr);
    }
}
