// WAP Count digitd of a number 

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int num,count=0;
        System.out.print("Enter Number = ");
        num = sb.nextInt();
        int find=num;
        while(num !=0){
            num/=10;
            count ++;
        }
        System.out.println("The "+count+" Digit Number is = "+find);
    }
}
