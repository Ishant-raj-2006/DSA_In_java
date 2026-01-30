//WAP for print 
//  *  *  *  *  *  
//  *  *  *  *  *  
//  *  *  *  *  *  
//  *  *  *  *  *  
//  *  *  *  *  * 
// When take input from user , row, column 

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
       int row, col;
       System.out.print("Enter the value of Row = ");
       row = sb.nextInt();
       System.out.print("Enter the value of column = ");
       col = sb.nextInt();
       for(int i=1; i<=row; i++){
        for(int j=1 ;j<=col; j++){
            System.out.print(" * ");
        }
        System.out.println(" ");
       }
    }
}