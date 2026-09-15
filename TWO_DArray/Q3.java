// Write a program to take input and also take input for each element, and print all the matrices. 

import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int row ;
        int col;
        System.out.print("Enter The value of Rows ");
        row = sb.nextInt();
        System.out.print("Enter The value of Columns ");
        col = sb.nextInt();
        int [][] arr = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter the value of [" + (i+1) + "][" + (j+1) + "] = ");
                arr[i][j] = sb.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
            
        }
    }
}