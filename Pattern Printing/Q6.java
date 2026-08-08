
// WAP for print the Rectangle when take input how many row , col , in Rectangle 

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int row,col;
        System.out.print("Enter Row =");
        row = sb.nextInt();
        System.out.print("Enter Col =");
        col = sb.nextInt();
        for(int i=97; i<97+row; i++){
            for(int j=97; j<97+col; j++){
                System.out.print(" "+(char)j+" ");
            }
            System.out.println();
        }
    }
}
