// WAP for print the sum of digit


import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num,sum=0,rev;
        System.out.print("Enter Number =");
        num = sb.nextInt();
        while(num !=0){
            sum  +=num%10;
            num = num/10;
           
        }
        System.out.println(sum);
    }
}
