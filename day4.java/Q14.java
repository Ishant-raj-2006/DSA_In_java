//WAP for print Ulta '*' trangle.
//  *  *  *  *  * 
//  *  *  *  * 
//  *  *  * 
//  *  * 
//  *
//  * 

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num;
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0; j<num-i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
