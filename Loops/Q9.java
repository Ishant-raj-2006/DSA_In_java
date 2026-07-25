// WAP for count the digit of Number.


import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter number = ");
        int num = sb.nextInt();
        if(num ==0) num=7;
        int count =0;
        while(num !=0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}


// 02:57 

