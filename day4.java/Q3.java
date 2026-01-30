// WAP for print Number Squre 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 
// 1 2 3 4 5 6 7 8 9 10 


import java.util.Scanner;

public class Q3 {
   public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    int num;
    System.out.print("Enter Number = ");
    num = sb.nextInt();
    for(int i=1; i<=num; i++){
        for(int j=1; j<=num; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
   }
}
