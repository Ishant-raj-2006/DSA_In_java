// WAP for TAke 'n' as input from user and print the following sequence..
// 1
// n
// 2
// n-1
// 3
// n-2
//.......... 

import java.util.Scanner;

public class Q11 {
   public static void main(String[] args) {
    Scanner sb = new Scanner(System.in);
    int n,a=1;
    System.out.print("Enter Number = ");
    n = sb.nextInt();
    int b=n;
    for(int i=1;i<=n; i++){
        if(i%2!=0){
            System.out.println(a);
            a++;
        }
        else{
            System.out.println("This is part of n = "+b);
            b--;
        }
    }
   } 
}
