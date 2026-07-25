// WAP for print the reverse of any number 


import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num ,r=0;
        System.out.print("Enter Number = ");
        num = sb.nextInt();

        while(num !=0){
            r  *=10;
            r +=(num%10);
            num = num/10;
        }
        System.out.println(r);
    }
}
