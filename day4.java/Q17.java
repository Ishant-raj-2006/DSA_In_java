// WAP for print Hollow Rectangle.
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n,m;
        System.out.print("Enter the number of rows = ");
        n = sb.nextInt();
        System.out.print("Enter the number of Columan = ");
        m = sb.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
