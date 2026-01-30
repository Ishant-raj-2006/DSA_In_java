// WAP for print numeric ulta trangle.
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 


import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num;
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        for(int i=1; i<=num+1; i++){
            for(int j=1; j<=num-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
