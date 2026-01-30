// WAP for print Alphabet Squre .
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 
// A B C D E 

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num;
        System.out.print("Enter Number = ");
        num =sb.nextInt();
        for(int i=65; i<=64+(num); i++){
            for(int j=65; j<=64+(num); j++){
                System.out.print((char)(j)+" ");
            }
            System.out.println();
        }
    }
}
 