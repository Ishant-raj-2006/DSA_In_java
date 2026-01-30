// WAP for print Number Trangle
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num;
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        for (int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}