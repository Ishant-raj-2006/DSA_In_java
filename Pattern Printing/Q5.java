
// WAP for print the Rectangle when take input how many row , col , in Rectangle 

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int row,col;
        System.out.print("Enter Row =");
        row = sb.nextInt();
        System.out.print("Enter Col =");
        col = sb.nextInt();
        for(int i=65; i<65+row; i++){
            for(int j=65; j<65+col; j++){
                System.out.print(" "+(char)j+" ");
            }
            System.out.println();
        }
    }
}
