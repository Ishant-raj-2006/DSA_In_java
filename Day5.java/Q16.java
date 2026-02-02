//  WAP for Permitation and the combination

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n ,r ,nfact=1,rfact=1,nrfact=1;
        System.out.print("Enter the value of 'n' = ");
        n = sb.nextInt();
        
        System.out.print("Enter the value of 'r' = ");
        r = sb.nextInt();
        for(int i=1; i<=n; i++){
            nfact *=i; 
        }
        for(int i=1; i<=r; i++){
            rfact *=i; 
        }
        for(int i=1; i<=(n-r); i++){
            nrfact *=i; 
        }
        int ncr =nfact/(rfact*nrfact);
        System.out.println(ncr);
    }
}
