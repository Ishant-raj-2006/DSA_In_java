// WAP for print small alphabet Squre 
// a b c d e 
// a b c d e 
// a b c d e 
// a b c d e 
// a b c d e 

import java.util.Scanner;

public class Q5 {
public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    int num; 
    System.out.print("Enter Numebr = ");
    num = sb.nextInt();
    for(int i=97; i<97+(num); i++){
        for(int j= 97; j<97+(num); j++){
            System.out.print((char)j+" ");
        }
        System.out.println();
    }
    
}    
}
