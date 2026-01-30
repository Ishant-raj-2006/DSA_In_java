// WAP for print number Squre 
// 1 1 1 1 1 
// 2 2 2 2 2 
// 3 3 3 3 3 
// 4 4 4 4 4 
// 5 5 5 5 5 


import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num;
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
