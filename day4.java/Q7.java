// WAP for print small alphbet squre.
// a a a a a 
// b b b b b 
// c c c c c 
// d d d d d 
// e e e e e

import java.util.Scanner;

public class Q7 {
public static void main(String[] args) {
Scanner sb = new Scanner(System.in);
int num;
System.out.print("Enter number = ");
num = sb.nextInt();
for(int i=97; i<97+(num); i++){
    for(int j=97; j<97+(num); j++){
        System.out.print((char)+i+" ");
    }
    System.out.println();
}
}
}