// WAP for print Number Square


import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int row,col;
        System.out.print("Enter Row =");
        row = sb.nextInt();
        System.out.print("Enter Col =");
        col = sb.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
}
